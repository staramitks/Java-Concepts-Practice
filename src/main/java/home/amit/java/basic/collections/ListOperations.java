package home.amit.java.basic.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListOperations {
    public static void main(String[] args) {
        ListOperations listOperations = new ListOperations();
        listOperations.checkAddNum();
        listOperations.printDuplicates();
        listOperations.getSum();
        listOperations.getMax();
        listOperations.getMin();

    }

    private void checkAddNum() {
        var intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        System.out.println("List is " + intList);
        intList.add(1, 90);
        System.out.println("updated List is " + intList);
    }

    private void printDuplicates() {
        ArrayList<Integer> intList = getIntegersList();
        Set<Integer> unique = new HashSet<>();
        intList.stream().filter((i) -> !unique.add(i)).forEach(i -> System.out.println(i));
    }

    private void getSum() {
        ArrayList<Integer> intList = getIntegersList();
        int sumResult = intList.stream().reduce((i, j) -> i + j).get();
        int otherWay=intList.stream().reduce(Integer::sum).get();
        System.out.println("Result is " + sumResult);
    }

    private void getMin() {
        ArrayList<Integer> intList = getIntegersList();
        int min = intList.stream().reduce((i, j) -> i < j ? i : j).get();
        int otherWay=intList.stream().reduce(Integer::min).get();
        System.out.println("Result is " + min);
    }

    private void getMax() {
        ArrayList<Integer> intList = getIntegersList();
        int max = intList.stream().reduce((i, j) -> i > j ? i : j).get();
        int otherWay=intList.stream().reduce(Integer::max).get();
        System.out.println("Result is " + max);
    }

    private ArrayList<Integer> getIntegersList() {
        var intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        return intList;
    }
}
