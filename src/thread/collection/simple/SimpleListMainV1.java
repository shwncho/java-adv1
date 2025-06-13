package thread.collection.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleListMainV1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 스레드1, 스레드2 동시 실행 가정
        list.add("A"); // 스레드 1 실행 가정
        list.add("B"); // 스레드 2 실행 가정
        System.out.println(list);
    }
}
