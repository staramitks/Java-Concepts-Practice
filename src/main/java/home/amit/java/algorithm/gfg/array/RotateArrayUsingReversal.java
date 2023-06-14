package home.amit.java.algorithm.gfg.array;

import java.util.Arrays;

public class RotateArrayUsingReversal {


    static void rotateArr(int[] arr, int d, int n) {

        //2,1
        reverseArray(arr, 0, d - 1);
        //5,4,3
        reverseArray(arr, d, n - 1);
        //3,4,5,1,2
        reverseArray(arr, 0, n - 1);


    }


    static void reverseArray(int[] ar, int start, int end) {

        while (start < end) {
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        RotateArray.rotateArr(myArray, 2, 5);
        System.out.println(Arrays.toString(myArray));

    }


}
