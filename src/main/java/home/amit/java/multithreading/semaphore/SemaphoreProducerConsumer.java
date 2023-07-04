package home.amit.java.multithreading.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SemaphoreProducerConsumer {
    public static void main(String[] args) {

        Semaphore consumerSemaphore = new Semaphore(0);
        Semaphore producerSemaphore = new Semaphore(1);
        List<Integer> intList = new ArrayList<>();
        Thread putThread = new Thread(new PutThread(producerSemaphore, consumerSemaphore, "Producer", intList));
        Thread getThread = new Thread(new GetThread(producerSemaphore, consumerSemaphore, "Consumer", intList));
        putThread.start();
        getThread.start();
        try {
            putThread.join();
            getThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
