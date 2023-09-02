package home.amit.java.multithreading;

import java.util.concurrent.*;

public class CalculatorExample {


    public static void main(String[] args) {

        executorService();

        home.amit.java.multithreading.Calculator thread = new home.amit.java.multithreading.Calculator();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
//		synchronized(thread)
//		{
//			try {
//				thread.wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}

        System.out.println("Sum is " + thread.sum);


    }

    private static void executorService() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Long> future = executorService.submit(() -> {
            long sum = 0;
            for (long i = 0; i < 100; i++) {
                sum = sum + i;

            }
            return sum;
        });


        executorService.shutdown();
        try {
            System.out.println("Final Sum is " + future.get(5,TimeUnit.SECONDS));
        } catch (InterruptedException | ExecutionException |TimeoutException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    private static void waitNotifyService() {
        Thread sumthread = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

                long sum = 0;
                for (long i = 0; i < 100; i++) {
                    sum = sum + i;

                }

            }

        }

        );


    }


}

class Calculator extends Thread {
    long sum;

    public void run() {
        synchronized (this) {
            for (long i = 0; i < 100; i++) {
                sum = sum + i;
            }
            notify();
        }
    }


}
