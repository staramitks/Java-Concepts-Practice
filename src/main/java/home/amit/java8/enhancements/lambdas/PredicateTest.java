package home.amit.java8.enhancements.lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        Predicate<Integer> predicate = (n) -> n > 10;
        System.out.println("Result is " + predicate.test(0));
        Function<Integer, Boolean> function = (n) -> n / 2 == 0;
        System.out.println("Function Result is " + function.apply(3));


    }
}
