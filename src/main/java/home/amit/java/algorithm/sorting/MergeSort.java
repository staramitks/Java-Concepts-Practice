package home.amit.java.algorithm.sorting;

public class MergeSort {

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


        int i=0;
        int j=0;
        int k=0;
        while(i<leftArray.length && j<rightArray.length)
        {
            if (leftArray[i] < rightArray[j])
            {
                resultArray[k]=leftArray[i];
                k++;
                i++;
            }
            else if (leftArray[i] > rightArray[j])
            {
                resultArray[k]=rightArray[j];
                 k++;
                 j++;
            }
            else
            {
                resultArray[k]=leftArray[i];
                i++;
                k++;
                resultArray[k]=rightArray[j];
                k++;
                j++;
            }
        }

        if (i>j)
        {
            for (int left=j;left<rightArray.length;left++)
            {
                resultArray[k]=rightArray[left];
                k++;
            }
        }
        else {
            if (i < j) {
                for (int left = i ; left < leftArray.length; left++) {
                    resultArray[k] = leftArray[left];
                    k++;
                }
            }
        }
        return resultArray;

    }



    public static void main(String[] args) {

        MergeSort mergeSort= new MergeSort();
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        mergeSort.mergeSort(actual, actual.length);

        for (int i=0;i<actual.length;i++)
        {
            System.out.println(actual[i]);
        }

    }
}

