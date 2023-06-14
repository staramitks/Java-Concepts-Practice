package home.amit.java.multithreading.semaphore;

import java.util.List;
import java.util.concurrent.Semaphore;

public class DecrementThread implements Runnable {

    private final Semaphore sm;
    private final String threadName;
    List<Integer> list;

    public DecrementThread(Semaphore sem, String threadName, List<Integer> list) {
        this.sm = sem;
        this.threadName = threadName;
        this.list = list;

    }

    public void run() {
        System.out.println(threadName + " is waiting for the permit");
        int counter = 0;
        try {
            sm.acquire();
            while (true) {
                if (list.size() == 1) {

                    int removedElement = list.get(0);
                    list.remove(0);
                    System.out.println("Decrement Counter removed " + removedElement);
                    Thread.sleep(10);

                }
                sm.release();
            }

        } catch (InterruptedException e) {

            System.out.println("Thread interrupted with error as " + e);
        }

    }


}
