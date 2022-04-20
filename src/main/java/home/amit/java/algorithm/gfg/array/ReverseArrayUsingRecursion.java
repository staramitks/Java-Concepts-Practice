package home.amit.java.algorithm.gfg.array;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {

    public void reverseArray(int array[], int start, int end)
    {
        if (start>end)
        {
            return;
        }

        System.out.println("Invoking for start and end as "+start +" "+end);
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        start++;
        end--;
        reverseArray(array, start, end);

     }

    public static void main(String[] args) {
        //int[] myArray=DataProvider.getArray();
        int[] myArray=new int[]{1,2,3,4,5,6,7,8,9,10};
        ReverseArrayUsingRecursion reverseArrayUsingRecursion= new ReverseArrayUsingRecursion();
        System.out.println(Arrays.toString(myArray));
        reverseArrayUsingRecursion.reverseArray(myArray,0,myArray.length-1);
        System.out.println(Arrays.toString(myArray));
    }
}
