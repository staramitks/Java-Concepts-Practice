package home.amit.dynamic.recursion.concepts;
/*
User :- AmitSingh
Date :- 7/19/2023
Time :- 7:51 PM
Year :- 2023
*/

import home.amit.java.algorithm.search.BinarySearch;
import home.amit.java8.enhancements.defaultexamples.B;

public class BinarySearchUsingRecursion {

    public static void main(String[] args) {
        int[] array={1,2,3,5,6,7,8,9,10,12};
        int target = 10;

        boolean found = binarySearch(array, target);
        System.out.println("Target found: " + found);
    }

    public static boolean binarySearch(int[] array, int target) {
        return binarySearchRecursive(array, target, 0, array.length - 1);
    }

    private static boolean binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return true;
        } else if (target < array[mid]) {
            return binarySearchRecursive(array, target, left, mid - 1);
        } else {
            return binarySearchRecursive(array, target, mid + 1, right);
        }
    }


}
