package home.amit.java.practice;
/*
User :- AmitSingh
Date :- 7/17/2023
Time :- 9:00 PM
Year :- 2023
*/

public class StringReverseUsingRecursion {

    private String reverseString(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }

        String output = input.substring(input.length() - 1) + reverseString(input.substring(0, input.length() - 1));
        return output;

    }


    public static void main(String[] args) {

        String myname = "amitkumarsingh";
        StringReverseUsingRecursion stringReverseUsingRecursion = new StringReverseUsingRecursion();
        System.out.println(stringReverseUsingRecursion.reverseString(myname));


    }
}
