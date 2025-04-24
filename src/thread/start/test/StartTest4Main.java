package thread.start.test;

import static thread.util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread A = new Thread(new PrintWork("A",1000), "Thread-A");
        Thread B = new Thread(new PrintWork("B",500), "Thread-B");

        A.start();
        B.start();
    }

    static class PrintWork implements Runnable {

        private final String content;
        private final int sleepMs;

        PrintWork(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            while(true) {
                try {
                    log(content);
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
