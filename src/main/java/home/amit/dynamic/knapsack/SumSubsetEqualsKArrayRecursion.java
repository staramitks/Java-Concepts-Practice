package home.amit.dynamic.knapsack;

import java.util.Arrays;
import java.util.List;

public class SumSubsetEqualsKArrayRecursion {


    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(3, 34, 4, 12, 5, 2);
        int sum=35;
        boolean result=checkSum(list,list.size(),sum);
        System.out.println("Result is "+result);
        List<Integer> secondList = list.subList(0,list.size());

    }

    private static boolean checkSum(List<Integer> list, int size, int sum) {

        if (sum==0 || size==0)
        {
            if (sum==0)
            {
                return true;
            }
            return false;
        }
        return checkSum(list.subList(0,size-1), size -1, sum-list.get(size-1))||
                checkSum(list.subList(0,size-1), size -1, sum);

    }
}
