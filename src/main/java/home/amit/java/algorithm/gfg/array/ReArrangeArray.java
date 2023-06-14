package home.amit.java.algorithm.gfg.array;

/*
Rearrange array such that arr[i] >= arr[j] if i is odd and arr[i]<=arr[j] if i is even and j < i
Difficulty Level : Medium
Last Updated : 20 Dec, 2021
Given an array of n elements. Our task is to write a program to rearrange the array such that elements
at odd positions are greater than all elements before it and elements at even positions are less than all elements before it.
Examples:

Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
Output : 4 5 3 6 2 7 1

Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8}
Output : 4 5 2 6 1 8 1 8

https://www.geeksforgeeks.org/rearrange-array-arri-arrj-even-arri/?ref=lbp

*/


import java.util.Arrays;

public class ReArrangeArray {


    public void reArrage(int[] array) {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        Arrays.sort(copiedArray);
        int evenPos = array.length / 2;
        int oddPos = array.length - evenPos;
        int size = array.length;

        int j = oddPos - 1;
        for (int i = 0; i < size; i += 2) {

            array[i] = copiedArray[j];
            j--;
        }

        j = oddPos;
        for (int k = 1; k < size; k += 2) {

            array[k] = copiedArray[j];
            j++;
        }

        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {
        int[] ar = new int[]{1, 2, 3, 4, 5, 6, 7};
        ReArrangeArray reArrangeArray = new ReArrangeArray();
        reArrangeArray.reArrage(ar);


    }
}



