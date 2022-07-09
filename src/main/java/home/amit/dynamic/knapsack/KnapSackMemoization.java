package home.amit.dynamic.knapsack;

public class KnapSackMemoization {

    public int knapsack(int[] wt, int[] price, int w, int n, int[][] dp)
    {
        if (n==0 || w ==0)
        {
            return 0;
        }
        if (dp[n][w]!=-1)
        {
            return dp[n][w];
        }

        if (wt[n-1] <= w )
        {
            dp[n][w]=Integer.max(knapsack(wt, price, w, n-1,dp), price[n-1]+knapsack(wt, price, w-wt[n-1], n-1,dp) );
            return dp[n][w];
        }
        else
            dp[n][w]=knapsack(wt, price, w, n-1,dp);
            return dp[n][w];

    }



    public int knapsackmain(int[] wt, int[] price, int w, int n)
    {
        int[][] dp =new int[n+1][w+1];
        for (int i=0;i<n+1; i++)
        {
            for (int m=0;m<w+1; m++)
            {
                dp[i][m]=-1;
            }
        }
        int val=knapsack(wt,price,w,n,dp);
        return val;

    }


    public static void main(String[] args) {

        int[] wt={1,2,3,4,5};
        int[] price={2,4,7,8,9};
        int weight=8;
        int n=4;
        int[][] dp =new int[n+1][weight+1];
        KnapSackMemoization knapSack= new KnapSackMemoization();
        int val=knapSack.knapsackmain(wt,price,weight,n);
        System.out.println(val);

    }
}
