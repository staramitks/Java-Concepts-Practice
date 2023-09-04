package home.amit.java.algorithm.lists;
/*
User :- AmitSingh
Date :- 7/14/2023
Time :- 4:21 PM
Year :- 2023
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLInkedListReverse {

    public static void main(String[] args) {


        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(20);
        testList.add(30);
        testList.add(40);
        testList.add(50);
        testList.forEach(i -> System.out.println(i));

        Collections.reverse(testList);
        testList.forEach(i -> System.out.println(i));


    }
}
