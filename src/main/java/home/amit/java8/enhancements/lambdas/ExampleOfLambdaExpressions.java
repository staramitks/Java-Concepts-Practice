package home.amit.java8.enhancements.lambdas;
/*
User :- AmitSingh
Date :- 6/24/2023
Time :- 10:25 AM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/

import java.util.concurrent.Callable;

public class ExampleOfLambdaExpressions {

    public static void main(String[] args) {

        Runnable r = () -> {
        };
        Callable callable = () -> "Amit";
        Callable callable2 = () -> {
            return "Amit";
        };


    }
}
