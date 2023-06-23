package home.amit.java.algorithm.sorting;


/*

About Divide and merge - Divide from middle
Divide till only 1 element is left and then merge
1- Find mid point - terminal condition mid point is less than 2 mergesort (int[] a , int n)
2- create left and right array
3- merge sort (left , mid)
4- merge sort (r, n-mid)
5- join array (l,r,a)


 */
public class MergeSort {

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        int[] actual = {5, 1, 6, 2, 3, 4};
        mergeSort.mergeSort(actual, actual.length);

        for (int i = 0; i < actual.length; i++) {
            System.out.println(actual[i]);
        }

    }

    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        joinArray(l, r, a);
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
                resultArray[k++] = rightArray[right];
            }
        } else {
            if (i < j) {
                for (int left = i; left < leftArray.length; left++) {
                    resultArray[k++] = leftArray[left];
                }
            }
        }
        return resultArray;

    }
}

