package thread.control;

import thread.util.ThreadUtils;

import static thread.util.ThreadUtils.*;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        public void run() {
            sleep(1000);
        }
    }
}
