package home.amit.java.basic.collections;
/*
User :- AmitSingh
Date :- 8/3/2023
Time :- 3:27 PM
Year :- 2023
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        deque.stream().forEach(System.out::println);

    }
}
