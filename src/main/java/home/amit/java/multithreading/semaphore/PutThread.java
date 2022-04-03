package home.amit.java.multithreading.semaphore;

import java.util.List;
import java.util.concurrent.Semaphore;

public class PutThread implements  Runnable{

    Semaphore consumerSemaphore;
    Semaphore producerSemaphore;
    String name;
    List<Integer> intList;
    public PutThread(Semaphore producer, Semaphore consumer, String name, List<Integer> list)
    {
        this.consumerSemaphore=consumer;
        this.producerSemaphore=producer;
        this.name=name;
        this.intList=list;

    }



    @Override
    public void run() {


        int counter=0;
       for (counter=0;counter<=100;counter++) {
            try {
                producerSemaphore.acquire();
                System.out.println(name +"==> Produced Value   " + counter);
                intList.add(counter);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            consumerSemaphore.release();
        }
        System.out.println("Exiting from loop");

    }
}
