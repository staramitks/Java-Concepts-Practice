package home.amit.java.algorithm.dp.recursion;

public class OptimalRodCutting {

    public static int rodcut(int[] price , int n)
    {
//        System.out.println("Calling for rod of length "+n);
        if (n==0)
        {
            return 0;
        }
        int maxValue = Integer.MIN_VALUE;

        for (int i=1; i <= n; i++)
        {
            int cost = price[i-1] + rodcut(price,n-i);
            if (cost > maxValue)
            {
               // System.out.println("MAx Value is "+maxValue);
                maxValue=cost;
            }
        }
        return maxValue;
    }


    public static void main(String[] args) {
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        // rod length
        int n = 4;

        System.out.println("Profit is " + rodcut(price, n));

    }

}
