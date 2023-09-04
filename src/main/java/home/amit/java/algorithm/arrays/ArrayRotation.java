package home.amit.java.algorithm.arrays;
/*
User :- AmitSingh
Date :- 7/13/2023
Time :- 10:09 PM
Year :- 2023
*/

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 7;

        int[] rotatedArray = rotateArrayLeft(array, n);

        // Print the rotated array
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotateArrayLeft(int[] arr, int n) {
        if (n == 0 || n % arr.length == 0) {  // If n is 0 or a multiple of array length, no rotation is needed
            return arr;
        }

        int length = arr.length;

        // Adjust n to be within the range of the array length
        n = n % length;

        // Store the first n elements in a temporary array
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements n positions to the left
        for (int i = n; i < length; i++) {
            arr[i - n] = arr[i];
        }

        // Place the elements from the temporary array at the end
        for (int i = 0; i < n; i++) {
            arr[length - n + i] = temp[i];
        }

        return arr;
    }
}
