package home.amit.dynamic.knapsack;

public class EqualSumPartition {

    public boolean checkEqualSumPartition(int[] arr)
    {
        int sum=0;
        int size=arr.length;
        for (int i=0;i<size;i++)
        {
            sum=sum+arr[i];
        }
        if (sum%2!=0)
        {
            return false;
        }
        else
            return checkSubsetSum(arr, sum/2,size);


    }

    private boolean checkSubsetSum(int[] arr, int sum, int n) {

        if (sum==0)
        {
            return true;
        }
        if (sum!=0 && n==0)
        {
            return false;
        }
        boolean[][] dp= new boolean[n+1][sum+1];

        for (int m=0; m<=n; m++)
        {
            for (int s=0; s<=sum; s++)
            {
                if (m==0)
                {
                    dp[m][s]=false;
                }
                if (s==0)
                {
                    dp[m][s]=true;
                }

            }
        }
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=sum; j++)
            {
                if(arr[i-1]<=j)
                {
                    int v=arr[i-1];
                    int v1=j-v;
                    System.out.println(i+ " and j - arr[i-1] => "+v1 +" i-1  are " );
                    dp[i][j] = dp[i][j - arr[i-1]] || dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];

    }

    public static void main(String[] args) {
     int[] array ={ 5,1,5,11 };
     EqualSumPartition equalSumPartition = new EqualSumPartition();
        System.out.println(equalSumPartition.checkEqualSumPartition(array));


    }
}
