package home.amit.java8.enhancements.lambdas;
/*
User :- AmitSingh
Date :- 6/24/2023
Time :- 10:56 AM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/

import java.util.function.Function;

public class FunctionalExample {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.andThen(g);
        System.out.println("Result is " + h.apply(2));
    }
}
