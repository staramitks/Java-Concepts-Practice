package home.amit.java.multithreading;

/*
 *
 * Drawback of using synchronization in java
 * it can introduce thread contention, it can occur when two or more threads try to
 * access the same resource simultaneously
 * and cause java runtime to execute one or more threads slowly
 * Thread Starvation and livelock are forms of thread contention
 *
 *
 *
 */
class Counter implements Runnable {
    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }

    @Override
    public void run() {

        incrementAndDecrement();
    }


    //incrementing Without this synchronized block it will run into race condition as all three threads are accessing same
    // object so it needs protection from race condition
    private void incrementAndDecrement() {
        synchronized (this) {
            this.increment();
            System.out.println(Thread.currentThread().getName() + " -> " + this.getValue());
            //decrementing
            this.decrement();
            System.out.println(Thread.currentThread().getName() + " -> " + this.getValue());
        }
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Value is " + counter.getValue());
    }
}