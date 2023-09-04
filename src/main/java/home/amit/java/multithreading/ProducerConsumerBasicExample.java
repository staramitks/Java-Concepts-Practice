package home.amit.java.multithreading;
/*
User :- AmitSingh
Date :- 6/21/2023
Time :- 6:09 AM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/


/*
Use shared object for synchronized lock block
Use wait and notify in while conditions

 */

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerBasicExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Thread myProducer = new MyProducer(list, "MyProducer");
        Thread myConsumer = new MyConsumer(list, "MyConsumer");
        myConsumer.start();
        myProducer.start();
    }


}


class MyProducer extends Thread {

    private final List<Integer> list;
    private int counter = 0;

    public MyProducer(List<Integer> list, String threadName) {
        super(threadName);
        this.list = list;
    }


    @Override
    public void run() {

        synchronized (list) {
            while (true) {
                while (list.size() > 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Producing " + counter);
                list.add(counter++);
                list.notifyAll();

            }

        }

    }

}

class MyConsumer extends Thread {
    private final List<Integer> list;

    public MyConsumer(List<Integer> list, String threadName) {
        super(threadName);
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                while (list.size() == 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Consuming " + list.get(0));
                list.remove(0);
                list.notifyAll();


            }

        }
    }


}
