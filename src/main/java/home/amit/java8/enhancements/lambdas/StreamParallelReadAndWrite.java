package home.amit.java8.enhancements.lambdas;
/*
User :- AmitSingh
Date :- 9/2/2023
Time :- 3:15 PM
Year :- 2023
*/

import java.util.ArrayList;
import java.util.List;

public class StreamParallelReadAndWrite {

    public static void main(String[] args) {
        // Create source and destination lists
        List<Integer> sourceList = new ArrayList<>();
        List<Integer> destinationList = new ArrayList<>();

        // Populate the sourceList with some data
        for (int i = 1; i <= 10; i++) {
            sourceList.add(i);
        }

        // Use parallel stream to read from sourceList and write to destinationList
        sourceList.parallelStream().forEach(element -> {
            // Process the element (e.g., apply some transformation)
            int newValue = element * 2;

            // Write the element to the destinationList
            destinationList.add(newValue);
        });

        // Print the destinationList to verify the results
        destinationList.forEach(System.out::println);
    }
}
