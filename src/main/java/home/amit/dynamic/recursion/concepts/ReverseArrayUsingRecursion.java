package home.amit.dynamic.recursion.concepts;
/*
User :- AmitSingh
Date :- 7/19/2023
Time :- 7:37 PM
Year :- 2023
*/

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseArrayUsingRecursion {

    public void reverseArray(int[] array, int l, int r)
    {

        if (l>=r)
        {
            return;
        }

        int right=array[r];
        int left=array[l];
        array[l]=right;
        array[r]=left;

        reverseArray(array,l+1, r-1);


    }


    public static void main(String[] args) {

        int[] array={1,2,3,45,6,7,8,9};
        ReverseArrayUsingRecursion lReverseArrayUsingRecursion= new ReverseArrayUsingRecursion();
        lReverseArrayUsingRecursion.reverseArray(array,0,7);

        Arrays.stream(array).forEach(System.out::println);



    }
}
