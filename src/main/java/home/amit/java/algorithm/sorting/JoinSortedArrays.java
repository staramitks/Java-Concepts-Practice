package home.amit.java.algorithm.sorting;
/*
User :- AmitSingh
Date :- 6/15/2023
Time :- 4:27 PM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/

public class JoinSortedArrays {

    public static void main(String[] args) {
        JoinSortedArrays joinSortedArrays = new JoinSortedArrays();
        int[] leftArray = {10, 20, 30, 40};
        int[] rightArray = {25, 35, 50, 60, 70, 80};
        int[] result = new int[leftArray.length + rightArray.length - 1];
        joinSortedArrays.joinArray(leftArray, rightArray, result);
    }


    private int[] joinArray(int[] leftArray, int[] rightArray, int[] resultArray) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                resultArray[k++] = leftArray[i++];
            } else if (leftArray[i] > rightArray[j]) {
                resultArray[k++] = rightArray[j++];
            } else {
                resultArray[k++] = leftArray[i++];
                resultArray[k++] = rightArray[j++];
            }
        }

        if (i > j) {
            for (int right = j; right < rightArray.length; right++) {
                resultArray[k] = rightArray[right];
                k++;
            }
        } else {
            if (i < j) {
                for (int left = i; left < leftArray.length; left++) {
                    resultArray[k] = leftArray[left];
                    k++;
                }
            }
        }
        return resultArray;

    }


}
