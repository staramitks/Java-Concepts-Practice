package home.amit.java8.enhancements.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplyStreamsExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> mulVal = list.stream().reduce((a, b) -> a * b);
        System.out.println(mulVal.get());
    }
}
