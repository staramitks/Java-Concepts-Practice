package home.amit.java.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreLocks {

    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        Runnable pr = new Producer(sem, "A");
        Thread producer = new Thread(pr);

        Runnable cons = new Consumer(sem, "B");
        Thread consumer = new Thread(cons);


        producer.start();
        consumer.start();

    }
}

class Shared {
    static int count = 0;
}

class Producer implements Runnable {
    String name;
    Semaphore sem;

    Producer(Semaphore s, String n) {
        sem = s;
        name = n;

    }

    public void run() {
        try {

            sem.acquire();
            System.out.println(name + " gets the permit");
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + Shared.count++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        sem.release();
        System.out.println(name + " releases the permit");
    }
}

class Consumer implements Runnable {
    String name;
    Semaphore sem;

    Consumer(Semaphore s, String n) {
        sem = s;
        name = n;

    }

    public void run() {
        try {
            System.out.println(name + " tries for  the permit");
            sem.acquire();
            System.out.println(name + " gets  the permit");
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + Shared.count--);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        sem.release();
        System.out.println(name + " releases the permit");
    }
}