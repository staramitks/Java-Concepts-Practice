package home.amit.java.algorithm.dp.recursion;

public class SubSequenceString {


    static void powerSet(String input, int index, String curr)
    {
       // System.out.println("Calling for index "+index);
        int n = input.length();

        // base case
        if (index == n)
        {
            System.out.println(curr);
            return;
        }

        // Two cases for every character
        // (i) We consider the character
        // as part of current subset
        // (ii) We do not consider current
        // character as part of current
        // subset
        powerSet(input, index + 1, curr + input.charAt(index));
        //System.out.println( " Second call for index "+index);
        powerSet(input, index + 1, curr);




    }

    public static void main(String[] args) {
        String str = "abc";
        int index = 0;
        String curr="";
        powerSet(str,index,curr);

    }
}
