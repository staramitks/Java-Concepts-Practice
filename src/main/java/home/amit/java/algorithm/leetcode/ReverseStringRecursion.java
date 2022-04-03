package home.amit.java.algorithm.leetcode;

import java.util.Arrays;

public class ReverseStringRecursion {

    public void reverseString(char[] input)
    {
        if (input.length==1)
        {
            System.out.print(input[0]);
            return;
        }
        else
        {
            System.out.print(input[input.length-1]);
            reverseString(Arrays.copyOf(input,input.length-1));
        }
     }

     public static void main(String[] args) {
        String inputStr="AmitSingh";
        char[] chars = inputStr.toCharArray();
         ReverseStringRecursion lreverseString= new ReverseStringRecursion();
         lreverseString.reverseString(chars);
    }


}
