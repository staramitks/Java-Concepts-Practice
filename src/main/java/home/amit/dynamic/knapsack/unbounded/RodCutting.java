package home.amit.dynamic.knapsack.unbounded;

public class RodCutting {
    private int cutRod(int[] price, int n) {
        //code here
        int[][] dp = new int[n + 1][n + 1];
        int[] lengthOfRod = new int[n];
        for (int i = 0; i < n; i++) {
            lengthOfRod[i] = i + 1;
        }
        //Base Case
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int not_pick = 0 + dp[i - 1][j];
                int pick = Integer.MIN_VALUE;
                if (lengthOfRod[i - 1] <= j) {
                    pick = price[i - 1] + dp[i][j - lengthOfRod[i - 1]];
                }

                dp[i][j] = Math.max(pick, not_pick);
            }
        }
        return dp[n][n];
    }

    public static void main(String[] args) {
        int[] price = {3, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;
        RodCutting rodCutting = new RodCutting();
        int maxPrice = rodCutting.cutRod(price, n);
        System.out.println(maxPrice);
    }
}
