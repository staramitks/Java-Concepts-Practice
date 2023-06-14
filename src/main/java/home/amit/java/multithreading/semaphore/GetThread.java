package home.amit.java.multithreading.semaphore;

import java.util.List;
import java.util.concurrent.Semaphore;

public class GetThread implements Runnable {

    Semaphore consumerSemaphore;
    Semaphore producerSemaphore;
    String name;
    List<Integer> intList;

    public GetThread(Semaphore producer, Semaphore consumer, String name, List<Integer> list) {
        this.consumerSemaphore = consumer;
        this.producerSemaphore = producer;
        this.name = name;
        this.intList = list;

    }


    @Override
    public void run() {

        int num = Integer.MIN_VALUE;
        for (int counter = 0; counter <= 100; counter++) {
            try {
                consumerSemaphore.acquire();
                num = intList.get(0);
                System.out.println(name + "==> Got Value   " + num);
                intList.remove(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            producerSemaphore.release();
        }
        System.out.println("Exiting from GET loop");
    }
}
