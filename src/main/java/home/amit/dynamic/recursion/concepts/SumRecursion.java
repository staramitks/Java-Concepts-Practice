package home.amit.dynamic.recursion.concepts;
/*
User :- AmitSingh
Date :- 7/19/2023
Time :- 7:05 PM
Year :- 2023
*/

public class SumRecursion {


    private int recursionSum(int x, int y) {
        if (y == 0) {
            return x;
        }

        return 1 + recursionSum(x, y - 1);

    }

    public static void main(String[] args) {

        SumRecursion sumRecursion = new SumRecursion();
        int sum = sumRecursion.recursionSum(10, 20);
        System.out.println("Sum  = " + sum);

    }
}
