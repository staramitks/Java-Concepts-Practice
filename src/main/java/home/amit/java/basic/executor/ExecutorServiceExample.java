package home.amit.java.basic.executor;
/*
User :- AmitSingh
Date :- 6/16/2023
Time :- 2:50 PM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        //String result = executorService.invokeAny(callables);
        List<Future<String>> result = executorService.invokeAll(callables);
        try{
        for (Future s:result)
        {
            System.out.println(s.get());
        }

        executorService.shutdown();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}