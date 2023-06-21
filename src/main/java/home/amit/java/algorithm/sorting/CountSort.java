package home.amit.java.algorithm.sorting;
/*
User :- AmitSingh
Date :- 6/21/2023
Time :- 6:56 AM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/

/*


Counting sort is a sorting technique based on keys between a specific range.
It works by counting the number of objects having distinct key values (a kind of hashing).
Then do some arithmetic operations to calculate the position of each object in the output sequence.
Counting sort makes assumptions about the data, for example, it assumes that values are going to be in the range of 0 to 10 or 10 – 99, etc,
 Some other assumption counting sort makes is input data will be positive integers.
Like other algorithms this sorting algorithm is not a comparison-based algorithm, it hashes the value in a temporary count array and uses them for sorting.
It uses a temporary array making it a non-In Place algorithm.
 */

import java.util.Arrays;

public class CountSort {




    public static void main(String[] args) {

        int[] inputArray={1,2,3,5,6,4,3,2,3,4,5,3,3,2};
        int maxval=9;
        int[] result=new int[maxval+1];


        for (int i:inputArray)
        {
            result[i]=result[i]+1;
        }
        int j=0;
        for (int i=0;i<result.length;i++)
        {
           int bucket=result[i];
           while (bucket>0)
           {
               inputArray[j++]=i;
               bucket--;
           }

        }

        System.out.println("Sorted Values "+ Arrays.toString(inputArray));
    }
}
