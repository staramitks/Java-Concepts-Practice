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
        try {
            int counter = 0;

            for (int i = 0; i < 100; i++) {
                sm.acquire();
                list.add(counter++);
                System.out.println("Increment Counter increased size to " + list.size() + " with value of " + list.get(list.size()-1));
                sm.release();
                Thread.sleep(100);

            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted with error as " + e);
        }
//        finally {
//            sm.release();
//        }
    }
}