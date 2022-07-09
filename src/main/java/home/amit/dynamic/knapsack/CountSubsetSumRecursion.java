package home.amit.dynamic.knapsack;

public class CountSubsetSumRecursion {


    public static void main(String[] args) {
        int[] array={2,3,4,5,6,10};
        int sum=10;
        int n=array.length;
        int resultCount=0;
        int result=checkSubset(array,sum,n,resultCount);
        System.out.println(result);
    }

    private static int checkSubset(int[] array, int sum, int n, int result) {
        if (sum==0)
        {
            return ++result;

        }
        else if(n==0 && sum!=0)
        {
            return 0;
        }
        else
            return checkSubset(array,sum-array[n-1],n-1,result) +checkSubset(array,sum,n-1,result);

    }

}
