package home.amit.java.algorithm.dp.recursion;

public class StringCapitlizePermutations {


    void printStringCapsPermutations(String input, String output)
    {
        if (input.length()==0)
        {
            System.out.println(output);
            return;
        }

        String op1=output+input.substring(0,1);
        String op2=output+input.substring(0,1).toUpperCase();
        String input1=input.length()==1?"":input.substring(1,input.length());
        printStringCapsPermutations(input1,op1);
        printStringCapsPermutations(input1,op2);

    }

    public static void main(String[] args) {
        String input="abcd";
        StringCapitlizePermutations stringCapitlizePermutations= new StringCapitlizePermutations();
        stringCapitlizePermutations.printStringCapsPermutations(input,"");


    }
}
