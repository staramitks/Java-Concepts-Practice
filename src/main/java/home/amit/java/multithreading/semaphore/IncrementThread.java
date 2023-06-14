package home.amit.java.multithreading.semaphore;

import java.util.List;
import java.util.concurrent.Semaphore;

public class IncrementThread implements Runnable {

    private final Semaphore sm;
    private final String threadName;
    List<Integer> list;

    public IncrementThread(Semaphore sem, String threadName, List<Integer> list) {
        this.sm = sem;
        this.threadName = threadName;
        this.list = list;
    }

    public void run() {
        System.out.println("Starting " + threadName);
        int counter = 0;
        try {
            sm.acquire();
            for (int i = 0; i < 1000; i++) {
                list.add(counter++);
                System.out.println("Increment Counter increased size to " + list.size() + "with vaue of " + list.get(0));
                Thread.sleep(100);
            }
            sm.release();
        } catch (InterruptedException e) {

            System.out.println("Thread interrupted with error as " + e);
        }

    }


}
