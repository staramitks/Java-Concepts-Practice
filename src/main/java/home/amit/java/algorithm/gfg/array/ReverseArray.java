package home.amit.java.algorithm.gfg.array;

import java.util.Arrays;

public class ReverseArray {


    public void reverseArray(int[] ar)
    {
        int start=0;
        int end=ar.length-1;
        while (start<end)
        {
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] array={1,2,3,4,5};
        ReverseArray reverseArray= new ReverseArray();
        reverseArray.reverseArray(array);
        System.out.println(Arrays.toString(array));


    }
}
