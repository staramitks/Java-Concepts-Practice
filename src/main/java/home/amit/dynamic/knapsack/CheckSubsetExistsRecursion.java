package home.amit.dynamic.knapsack;

public class CheckSubsetExistsRecursion {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 10};
        int sum = 180;
        int n = array.length;
        boolean result = checkSubset(array, sum, n);
        System.out.println(result);
    }

    private static boolean checkSubset(int[] array, int sum, int n) {
        if (sum == 0) {
            return true;
        } else if (n == 0 && sum != 0) {
            return false;
        } else
            return checkSubset(array, sum - array[n - 1], n - 1) || checkSubset(array, sum, n - 1);
    }
}
