package home.amit.java.algorithm.gfg.array;

import java.util.Arrays;

public class RotateArray {
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here

        int disp=d%n;

        for (int i=0; i<d; i++)
        {

            int temp=arr[0];
            for (int k=0;k<n-1;k++)
            {
                arr[k]=arr[k+1];
                if (k==n-2)
                {
                    arr[k+1]=temp;
                }

            }

        }

    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        RotateArray.rotateArr(myArray,2, 5);
        System.out.println(Arrays.toString(myArray));

    }
}
