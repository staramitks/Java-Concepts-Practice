package home.amit.java.multithreading.executors;
/*
User :- AmitSingh
Date :- 7/14/2023
Time :- 3:12 PM
Year :- 2023
*/

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorExample2 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();

        List<Callable<Integer>> listOfCallable = Arrays.asList(
                () -> {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.println("Returning 1 now ");
                    return 1;
                },
                () -> 2,
                () -> 3);

        try {

            List<Future<Integer>> futures = executor.invokeAll(listOfCallable);

            int sum = futures.stream().map(f -> {
                try {
                    return f.get(5,TimeUnit.SECONDS);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }).mapToInt(Integer::intValue).sum();

            System.out.println(sum);

        } catch (InterruptedException e) {// thread was interrupted
            e.printStackTrace();
        } finally {

            // shut down the executor manually
            executor.shutdown();

        }

    }

}