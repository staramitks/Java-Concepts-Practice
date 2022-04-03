package home.amit.java.algorithm.sorting;

import home.amit.java.basic.dataprovider.DataProvider;

public class InsertSort {

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ,");

        System.out.println();
    }
    //10,20,30,9,8,4,20
    //9,10,20,30,8,4,20
    public void sortArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];  //30
            int j = i - 1; //1

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }


    }
    public static void main(String[] args) {
        int[] array=DataProvider.getArray();
        InsertSort insertSort= new InsertSort();
        insertSort.sortArray(array);
        printArray(array);
    }
}
