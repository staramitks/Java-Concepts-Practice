package home.amit.java.multithreading;
/*
User :- AmitSingh
Date :- 6/15/2023
Time :- 7:37 PM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingBlockingQueue {


    public static void main(String[] args) {
        BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<Integer>();
        Thread p = new Thread(new Producer(sharedQ));
        Thread c = new Thread(new Consumer2(sharedQ));
        p.start();
        c.start();
    }
}

class Producer implements Runnable {
    BlockingQueue<Integer> sharedQ = null;

    public Producer(BlockingQueue<Integer> inList) {
        this.sharedQ = inList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sharedQ.put(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Consumer2 implements Runnable {

    BlockingQueue<Integer> sharedQ = null;


    public Consumer2(BlockingQueue<Integer> sharedQ) {
        this.sharedQ = sharedQ;

    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                i = sharedQ.take();
                System.out.println("Consuming " + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

