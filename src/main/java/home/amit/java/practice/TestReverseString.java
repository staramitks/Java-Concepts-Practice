package home.amit.java.practice;
/*
User :- AmitSingh
Date :- 8/31/2023
Time :- 3:44 PM
Year :- 2023
*/

public class TestReverseString {


    public String  reverseString (String str)
    {
        if (str.isEmpty()|| str.length()==1) {
            return str;
        } else {
            String temp=str.substring(1);
            System.out.println("Iterating for "+temp +" with "+str.charAt(0));
            String result=reverseString(temp) + str.charAt(0);                            //BCD +A -->CD+B -->D+C
            System.out.println("Result is "+result);
            return result;
        }
    }


    public static void main(String[] args) {

        TestReverseString testReverseString= new TestReverseString();
        String input="ABCD";
        String result=testReverseString.reverseString(input);
        System.out.println("Output is "+result);

    }
}
