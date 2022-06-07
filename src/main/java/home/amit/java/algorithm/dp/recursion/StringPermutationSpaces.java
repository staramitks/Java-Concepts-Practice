package home.amit.java.algorithm.dp.recursion;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationSpaces {

    public static void printPermutations(String input)
    {
        if (input.length()==0)
        {
            return ;
        }
        String output=input.substring(0,1);
        String input2=input.substring(1,input.length());
        solve(input2,output);

    }

    private static void solve(String input, String output) {

        if (input.length()==0)
        {
            System.out.println(output);
            return ;
        }

        String op1 = output+" "+input.substring(0,1);
        String op2 = output + input.substring(0,1);
        input=input.substring(1,input.length());
        solve(input,op1);
        solve(input, op2);

    }


    public static void main(String[] args) {
        String input="ABC";
        printPermutations(input);


    }
}
