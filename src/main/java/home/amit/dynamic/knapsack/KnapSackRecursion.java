package home.amit.dynamic.knapsack;

/*

Reference:
Knapsack Problem
https://www.youtube.com/watch?v=kvyShbFVaY8

 */


public class KnapSackRecursion {

    public int knapsack(int[] wt, int[] price, int w, int n) {
        // If array size is 0 or weight limit is 0
        if (n == 0 || w == 0) {
            return 0;
        }
        if (wt[n - 1] <= w) {
            return Integer.max(knapsack(wt, price, w, n - 1), price[n - 1] + knapsack(wt, price, w - wt[n - 1], n - 1));
        } else
            return knapsack(wt, price, w, n - 1);

    }


    public static void main(String[] args) {

        int[] wt = {1, 2, 3, 4, 5};
        int[] price = {2, 4, 7, 8, 9};
        int weight = 8;
        int n = wt.length;
        KnapSackRecursion knapSack = new KnapSackRecursion();
        int val = knapSack.knapsack(wt, price, weight, n);
        System.out.println(val);

    }
}
