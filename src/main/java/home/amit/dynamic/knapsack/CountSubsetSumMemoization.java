package home.amit.dynamic.knapsack;

public class CountSubsetSumMemoization {


    public static void main(String[] args) {
        int[] array={2,3,4,5,6,10};
        int sum=10;
        int n=array.length;
        int resultCount=0;
        int result=checkSubset(array,sum,n,resultCount);
        System.out.println(result);
    }

    private static int checkSubset(int[] array, int sum, int n, int result) {

        int[][] dparray = new int[n+1][sum+1];
        for (int num=0; num<=n; num++)
        {
            for (int s=0; s<=sum; s++) {
                if (num==0)
                {
                    dparray[num][s]=0;
                }
                if (s==0)
                {
                    dparray[num][s]=1;
                }
            }
        }

        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++) {
                if (array[i-1] <= j)
                {
                    dparray[i][j] = dparray[i-1][j-array[i-1]] + dparray[i-1][j];
                }
                else
                {
                    dparray[i][j] =  dparray[i-1][j];
                }
            }
        }
        return dparray[n][sum];
    }
}
