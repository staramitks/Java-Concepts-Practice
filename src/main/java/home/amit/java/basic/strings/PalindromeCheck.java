package home.amit.java.basic.strings;
/*
User :- AmitSingh
Date :- 7/17/2023
Time :- 9:22 PM
Year :- 2023
*/


/*

Main class to check palindrome

 */
public class PalindromeCheck {


    /*
    Function to check if a given string is palindrom
    returns boolean value;
   */
    private boolean isPalindrome(String input)
    {

       // Check for Boundary condition
        if (input==null || input.length()==1)
        {
            return true;
        }

        // Cleaning up the inout string
        input=input.replace(";","").replace("-","").toUpperCase();
        char[] chars = input.toCharArray();
        int start=0;
        int end=chars.length-1;

        // iterating and doing comparison from start to end
        while(start<=end)
        {
            if (chars[start] !=chars[end])
            {
                return false;
            }
            start++;
            end--;
        }
         return true;

    }


    // main function to start the program
    public static void main(String[] args) {
        PalindromeCheck palindromeCheck= new PalindromeCheck();
        System.out.println(palindromeCheck.isPalindrome("IsThif-ssih;tsi"));
    }

}
