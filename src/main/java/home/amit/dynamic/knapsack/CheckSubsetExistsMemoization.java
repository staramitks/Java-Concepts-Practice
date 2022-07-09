package home.amit.dynamic.knapsack;

public class CheckSubsetExistsMemoization {


    public static void main(String[] args) {
        int[] array={2,5,8};
        int sum=7;
        int n=array.length;
        boolean result=checkSubset(array,sum,n);
        System.out.println(result);
    }

    private static boolean checkSubset(int[] array, int sum, int n) {

        boolean[][] dparray=new boolean[n+1][sum+1];
        for (int num=0; num<=n; num++)
        {
            for (int s=0; s<=sum; s++) {
                if (num==0)
                {
                    dparray[num][s]=false;
                }
                if (s==0)
                {
                    dparray[num][s]=true;
                }
             }
        }

    for (int i=1;i<=n;i++)
    {
        for(int j=1;j<=sum;j++) {
            if (array[i-1] <= j)
            {
                //System.out.println("array[i-1] is "+ array[i-1]);
                dparray[i][j] = dparray[i-1][j-array[i-1]] || dparray[i-1][j];
            }
            else
            {
                dparray[i][j] =  dparray[i-1][j];
            }
        }

    }

//        for (int num=0; num<=n; num++)
//        {
//            System.out.println(num);
//            for (int s=0; s<=sum; s++) {
//                System.out.print (dparray[num][s] +" ");
//            }
//            System.out.println("   ");
//        }
//


        return dparray[n][sum];
    }

}
