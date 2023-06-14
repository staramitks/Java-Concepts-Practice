package home.amit.dynamic.knapsack;

public class SumSubsetEqualsKArrayMemoization {

    static int subsetSum(int[] a, int n, int sum) {
        // Storing the value -1 to the matrix
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = -1;
            }
        }

        // If the sum is zero it means
        // we got our expected sum
        if (sum == 0)
            return 1;

        if (n <= 0)
            return 0;

//            // If the value is not -1 it means it
//            // already call the function
//            // with the same value.
//            // it will save our from the repetition.
        if (dp[n - 1][sum] != -1)
            return dp[n - 1][sum];
//
//            // if the value of a[n-1] is
//            // greater than the sum.
//            // we call for the next value
        if (a[n - 1] > sum)
            return dp[n - 1][sum]
                    = subsetSum(a, n - 1, sum);
        else {

            // Here we do two calls because we
            // don't know which value is
            // full-fill our criteria
            // that's why we doing two calls
            if (subsetSum(a, n - 1, sum) != 0 || subsetSum(a, n - 1, sum - a[n - 1]) != 0) {
                return dp[n - 1][sum] = 1;
            } else
                return dp[n - 1][sum] = 0;
        }
    }

    // Driver Code
    public static void main(String[] args) {

        int n = 5;
        int[] a = {1, 5, 3, 7, 4};
        int sum = 12;

        if (subsetSum(a, n, sum) != 0) {
            System.out.println("YES\n");
        } else
            System.out.println("NO\n");
    }
}

// This code is contributed by rajsanghavi9.


