package home.amit.dynamic.recursion;
/*
User :- AmitSingh
Date :- 6/14/2023
Time :- 5:45 PM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/

public class SumTriangleBalls {

    public static void main(String... args) {
        SumTriangleBalls sumTriangleBalls= new SumTriangleBalls();
        System.out.println(sumTriangleBalls.getSum(1000));

    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }

    }
}
