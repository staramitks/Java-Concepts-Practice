package home.amit.java.practice;
/*
User :- AmitSingh
Date :- 8/30/2023
Time :- 10:58 AM
Year :- 2023
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowRateLimiter {

    int limit;
    long windowTimeLimit;
    List<Long> lastInsertionTime= new LinkedList<>();
    List<Integer> processedRequestsList= new ArrayList<>();

    public SlidingWindowRateLimiter(int limit, int windowTimeLimit)
    {
        this.limit=limit;
        this.windowTimeLimit=windowTimeLimit;

    }
    public boolean processRequest( int requestCount)
    {
        long requestTime=System.currentTimeMillis();
        if (processedRequestsList.size()<limit) {
            if (lastInsertionTime.isEmpty()) {
                processedRequestsList.add(requestCount);
                lastInsertionTime.add(requestTime);
                return true;
            }
            else{
                long lastProcessedTime=lastInsertionTime.get(lastInsertionTime.size()-1);
                if (lastProcessedTime+this.windowTimeLimit > requestTime)
                {
                    processedRequestsList.add(requestCount);
                    lastInsertionTime.add(requestTime);
                    return true;

                }
            }
        }
        else
        {
            return false;
        }

      return false;

    }


    public static void main(String[] args) {


        SlidingWindowRateLimiter slidingWindowRateLimiter= new SlidingWindowRateLimiter(21, 10000);
        for (int i=0;i<22;i++)
        {
            boolean processingStatus=slidingWindowRateLimiter.processRequest(i);
            System.out.println("Processing status of "+i + " is "+processingStatus);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
