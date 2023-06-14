package home.amit.dynamic.knapsack.unbounded;

public class LongestRepeatingSubsequence {


    public static void main(String[] args) {


        String s = "aabbccddeeff";
        String t = "aabbccddeeff";
        int m = s.length();
        int n = t.length();

        LongestRepeatingSubsequence longestRepeatingSubsequence = new LongestRepeatingSubsequence();
        int len = longestRepeatingSubsequence.getLongestRepeastingSubsequence(s, t, m, n);
        System.out.println("Length is " + len);

    }

    private int getLongestRepeastingSubsequence(String s, String t, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j] > dp[i][j - 1] ? dp[i - 1][j] : dp[i][j - 1];
                }
            }
        }
        return dp[m][n];

    }
}
