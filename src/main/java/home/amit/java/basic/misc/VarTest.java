package home.amit.java.basic.misc;
/*
User :- AmitSingh
Date :- 8/20/2023
Time :- 5:18 PM
Year :- 2023
*/

public class VarTest{
    public static int x = 5;

    public static void main(String[] args){
        int x=10;
        System.out.print(x+ " ");
        functionCall();
        System.out.print(x+ " ");
    }

    public static void functionCall() {
        x=15;
    }
}