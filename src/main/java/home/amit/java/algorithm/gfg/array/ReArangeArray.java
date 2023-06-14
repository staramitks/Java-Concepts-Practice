package home.amit.java.algorithm.gfg.array;

import java.util.Arrays;
import java.util.HashSet;

/*

Given an array of elements of length N, ranging from 0 to N – 1.
All elements may not be present in the array.
If the element is not present then there will be -1 present in the array.
Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
https://www.geeksforgeeks.org/rearrange-array-arri/?ref=lbp

 */
public class ReArangeArray {


    public static void reArrangeArray(int[] array) {
        var set = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        for (int k = 0; k < set.size(); k++) {
            if (set.contains(k)) {
                array[k] = k;
            } else {
                array[k] = -1;
            }

        }


    }

    public static void main(String[] args) {

        int[] myArray = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        reArrangeArray(myArray);
        System.out.println(Arrays.toString(myArray));


    }


}
