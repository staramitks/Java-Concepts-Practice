package home.amit.dynamic.knapsack;

public class KnapSackBottomUp {

    public int knapsack(int[] wt, int[] price, int w, int n, int[][] dp) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (wt[i - 1] <= w) {
                    dp[i][j] = Integer.max(price[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } else
                    dp[i][j] = dp[i - 1][w];

            }
        }

        return dp[n][w];

    }


    public static void main(String[] args) {

        int[] wt = {1, 2, 3};
        int[] price = {10, 15, 40};
        int weight = 6;
        int n = wt.length;
        int[][] dp = new int[n + 1][weight + 1];
        KnapSackBottomUp knapSack = new KnapSackBottomUp();
        int val = knapSack.knapsack(wt, price, weight, n, dp);
        System.out.println(val);

    }
}
