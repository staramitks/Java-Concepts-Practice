package home.amit.java.multithreading.executors;
/*
User :- AmitSingh
Date :- 9/2/2023
Time :- 3:29 PM
Year :- 2023
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceCompletion {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.submit(() -> {
            // Task 1
            System.out.println("Task 1 started.");
            // Simulate some work
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1 completed.");
        });

        executorService.submit(() -> {
            // Task 2
            System.out.println("Task 2 started.");
            // Simulate some work
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 completed.");
        });

        // Shutdown the executor service
        executorService.shutdown();

        try {
            // Wait for all tasks to complete or timeout after 1 minute
            boolean allTasksCompleted = executorService.awaitTermination(1, TimeUnit.MINUTES);
            if (allTasksCompleted) {
                System.out.println("All tasks completed.");
            } else {
                System.out.println("Not all tasks completed within the specified timeout.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (executorService.isTerminated()) {
            // Additional tasks after all submitted tasks are completed
            System.out.println("Performing additional tasks after task execution.");
        }
    }
}