package home.amit.dynamic.recursion.concepts;
/*
User :- AmitSingh
Date :- 7/19/2023
Time :- 7:24 PM
Year :- 2023
*/

public class PowerRecursion {

    private int power (int x, int y)
    {
        if (y==1)
        {
            return x;
        }
        return x*power(x,y-1);
     }


    public static void main(String[] args) {

        PowerRecursion productRecursion = new PowerRecursion();
        int power=productRecursion.power(2,10);
        System.out.println("power  = "+power);

    }
}
