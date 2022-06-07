package home.amit.java.algorithm.dp.recursion;

public class PowerSet {


    public void printPowerSet(String input, String op)
    {
        if (input.length()==0)
        {
            System.out.println(op);
            return;
        }

        String op1=op;
        String op2=op+input.substring(0,1);
        input=input.length()>1?input.substring(1,input.length()):"";
        printPowerSet(input,op1);
        printPowerSet(input,op2);

    }

    public static void main(String[] args) {
        String test="ab";
        PowerSet powerSet= new PowerSet();
        powerSet.printPowerSet(test,"");

    }



}
