package home.amit.java8.enhancements.lambdas;
/*
User :- AmitSingh
Date :- 4/29/2024
Time :- 7:45 PM
Year :- 2024
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterfaceExampleRunner {


    public static void main (String[] args) {

        Function<String,Integer> lengthFunction=s->s.length();
        List<String> names= Arrays.asList("This","is","a","test","function");
        List<Integer> lengths=names.stream().map(lengthFunction).collect(Collectors.toList());
        lengths.stream().distinct().forEach(a->System.out.println(a));

    }





}
