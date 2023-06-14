package home.amit.java.algorithm.leetcode;

public class ReverseStringPointer {

    public void reverseString(char[] input) {

        int endPointer = input.length - 1;

        for (int startPointer = 0; startPointer < endPointer; startPointer++, endPointer--) {
            char start = input[startPointer];
            input[startPointer] = input[endPointer];
            input[endPointer] = start;
        }


    }

    public static void main(String[] args) {
        String inputStr = "AmitSingh";
        System.out.println(inputStr);
        char[] chars = inputStr.toCharArray();
        ReverseStringPointer lreverseString = new ReverseStringPointer();
        lreverseString.reverseString(chars);
        System.out.println(chars);
    }
}
