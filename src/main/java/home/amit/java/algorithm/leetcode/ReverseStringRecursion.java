package home.amit.java.algorithm.leetcode;

import java.util.Arrays;

public class ReverseStringRecursion {

    public String reverseString(char[] input)
    {
        if (input.length==1)
        {
            System.out.print(input[0]);
            return String.valueOf(input[0]);
        }
        else
        {
            System.out.print(input[input.length-1]);
            return input[input.length-1]+reverseString(Arrays.copyOf(input,input.length-1));
        }
     }

     public static void main(String[] args) {
        String inputStr="AmitSingh";
        char[] chars = inputStr.toCharArray();
         ReverseStringRecursion lreverseString= new ReverseStringRecursion();
         String reversedString=lreverseString.reverseString(chars);
         System.out.println(reversedString);
    }


}
