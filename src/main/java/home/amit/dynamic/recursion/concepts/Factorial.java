package home.amit.dynamic.recursion.concepts;
/*
User :- AmitSingh
Date :- 7/19/2023
Time :- 7:27 PM
Year :- 2023
*/

public class Factorial {

    private int factorial(int n)
    {
        if (n==1)
        {
            return 1;
        }

        return n*factorial(n-1);

    }

    public static void main(String[] args) {

        Factorial factorial= new Factorial();
        int fact=factorial.factorial(4);
        System.out.println("Factorial is "+fact);

    }
}
