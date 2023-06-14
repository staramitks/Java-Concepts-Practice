package home.amit.java.algorithm.arrays;


/*

This problem can be converted to the problem of finding kth element, k is (A’s
length + B’ Length)/2.
If any of the two arrays is empty, then the kth element is the non-empty array’s kth
element. If k == 0, the kth element is the first element of A or B.
For normal cases(all other cases), we need to move the pointer at the pace of half of
an array length to get log(n) time.
a[] ={10,20, 30,40}
b[]= {15,25,35,45,55}
*/


public class MedianOfSortedArrays {

    public static double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if ((m + n) % 2 != 0) // odd
            return findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1);
        else { // even
            return (findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1)
                    + findKth(A, B, ((m + n) / 2) - 1, 0, m - 1, 0, n - 1)) * 0.5;
        }
    }

    public static int findKth(int[] A, int[] B, int k, int aStart, int aEnd, int bStart, int bEnd) {
        int aLen = aEnd - aStart + 1;
        int bLen = bEnd - bStart + 1;

        // Handle special cases
        if (aLen == 0)
            return B[bStart + k];
        if (bLen == 0)
            return A[aStart + k];
        if (k == 0)
            return A[aStart] < B[bStart] ? A[aStart] : B[bStart];

        int aMid = aLen * k / (aLen + bLen); // a’s middle count
        int bMid = k - aMid - 1; // b’s middle count

        aMid = aMid + aStart;
        bMid = bMid + bStart;
        if (A[aMid] > B[bMid]) {
            k = k - (bMid - bStart + 1);
            aEnd = aMid;
            bStart = bMid + 1;
        } else {
            k = k - (aMid - aStart + 1);
            bEnd = bMid;
            aStart = aMid + 1;
        }
        return findKth(A, B, k, aStart, aEnd, bStart, bEnd);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40};
        int[] b = {15, 25, 35, 45, 55};
        System.out.println(findMedianSortedArrays(a, b));

    }
}
