package home.amit.java.multithreading.executors;
/*
User :- AmitSingh
Date :- 7/14/2023
Time :- 3:15 PM
Year :- 2023

This method creates a thread pool that creates new threads as needed but will reuse previously constructed threads
when they are available.
These pools will typically improve the performance of programs that execute many short-lived asynchronous tasks.
Calls to execute will reuse previously constructed threads if available.
If no existing thread is available, a new thread will be created and added to the pool.
 Threads that have not been used for sixty seconds are terminated and removed from the cache
*/

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CachedThreadPoolExample {

    public static void main(final String[] args) throws InterruptedException, ExecutionException {

        System.out.println("Thread main started");

        Runnable task1 = () -> {
            System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };

        Runnable task2 = () -> {
            System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };
        Runnable task3 = () -> {
            System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };

        final ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println("Submitting the tasks for execution...");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();
        if (executorService.awaitTermination(10, TimeUnit.MINUTES))
        {
            System.out.println("Executor finished");
        }


        System.out.println("Thread main finished");
    }
}