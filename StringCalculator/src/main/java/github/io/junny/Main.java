package github.io.junny;

import java.util.ArrayList;

import static java.lang.Thread.sleep;
import static java.util.concurrent.ThreadLocalRandom.current;

public class Main {
    static ArrayList<String> array = new ArrayList<>();
    public static void main(String[] args) {

        Thread thread = new NewThread();
        thread.start();

        while (true){
            try {
                sleep(500L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            array.add("add after: " + current().nextInt() );
            System.out.println("add after: " + array.toString());

        }
    }
    static class NewThread extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    sleep(1500L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                array.removeAll(array);
                System.out.println("removed after: " + array.toString());
            }
        }
    }
}
