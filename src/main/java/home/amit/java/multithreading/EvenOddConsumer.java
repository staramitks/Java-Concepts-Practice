package home.amit.java.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class EvenOddConsumer {

    public static void main(String[] args) {
        DataHolder dataHolder = new DataHolder(new ArrayBlockingQueue<Integer>(1));

        final boolean runningFLag = true;
        Thread dataPutter = new Thread(new Runnable() {
            @Override
            public void run() {
                int num = 0;
                while (num <= 100) {

                    System.out.println("Putting number  for " + num + "time");
                    dataHolder.addNumber(num);

                    num++;
                    if (num > 100) {
                        break;
                    }
                }
            }


        }, "NumberPutter"

        );

        Thread evenThread = new Thread(new Runnable() {

            @Override
            public void run() {
                int evenCount = 0;
                int loopCount = 0;
                while (true) {
                    System.out.println("Get Even Number " + dataHolder.getEvenNumber());


                    if (evenCount == 100) {
                        break;
                    }
                }

            }

        }, "EvenThread");

        Thread oddThread = new Thread(new Runnable() {

            @Override
            public void run() {
                int oddLoop = 0;
                while (true) {
                    int oddCOunt = dataHolder.getOddNumber();
                    System.out.println("Get Odd Number " + oddCOunt);
                    if (oddCOunt == 99) {
                        break;
                    }
                }
            }

        }, "oddThread");

        evenThread.start();
        oddThread.start();
        dataPutter.start();

        try {
            dataPutter.join();
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
