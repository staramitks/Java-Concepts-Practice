package home.amit.java.exams.bnym;
/*
User :- AmitSingh
Date :- 9/11/2023
Time :- 11:26 AM
Year :- 2023
*/

import java.util.Arrays;
import java.util.List;

public class MinimumFountain {

    static int minCntFoun(List<Integer> list)
    {

        int N=list.size();
        int[] dp = new int[N];
        for(int i=0;i<N;i++)
        {
            dp[i]=-1;
        }

        int idxLeft;
        int idxRight;
        for (int i = 0; i < N; i++)
        {
            idxLeft = Math.max(i - list.get(i), 0);
            idxRight = Math.min(i + (list.get(i) + 1), N);
            dp[idxLeft] = Math.max(dp[idxLeft],
                    idxRight);
        }

        int cntfount = 1;

        int idxNext = 0;
        idxRight = dp[0];

        for (int i = 0; i < N; i++)
        {
            idxNext = Math.max(idxNext, dp[i]);
         if (i == idxRight)
            {
                cntfount++;
                idxRight = idxNext;
            }
        }
        return cntfount;
    }

    // Driver Code
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList( 1, 2, 1 );
        System.out.print(minCntFoun(list));
    }
}
