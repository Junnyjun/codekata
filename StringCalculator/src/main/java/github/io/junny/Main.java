package github.io.junny;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        OutOfMemoryList list = new OutOfMemoryList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
            list.remove(i);
        }
//        IntStream.range(0, 10)
//                .forEach(element -> {
//                    list.add(element);
//                    list.remove(element);
//                });

        list.get(9);
    }

}

class OutOfMemoryList {
    private ArrayList<String> list = new ArrayList<>();

    public void add(int value) {
        list.add(new String("ABCDEFGHQWERTZXCV" + value));
    }

    public void remove(int value) {
        String s = list.get(value);
        s = null;
    }

    public void get(int value) {
        Object data = list.get(value);

        System.out.println("data = " + data);
    }
}

