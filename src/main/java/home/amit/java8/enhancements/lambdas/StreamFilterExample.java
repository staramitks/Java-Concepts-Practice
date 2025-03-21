package home.amit.java8.enhancements.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {


    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("FirstName");
        myList.add("Second Name");

        myList.stream().filter(s -> {
            System.out.println("Printing for " + s);
            return true;
        }).map(s ->
                {
                    System.out.println("Inside Map Function " + s);
                    return s.toUpperCase();
                }
        ).collect(Collectors.toList());


        //List<String> secondList=myList.stream().filter(s -> true).map(s ->s.toUpperCase()).collect(Collectors.toList());
        List<String> secondList = myList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(secondList);
    }

}




