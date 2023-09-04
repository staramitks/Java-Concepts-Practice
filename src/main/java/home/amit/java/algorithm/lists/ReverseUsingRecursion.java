package home.amit.java.algorithm.lists;
/*
User :- AmitSingh
Date :- 7/14/2023
Time :- 4:26 PM
Year :- 2023
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseUsingRecursion {
    public static <T> void revlist(List<T> list) {
        // base condition when the list size is 0
        if (list.size() <= 1 || list == null)
            return;


        T value = list.remove(0);

        // call the recursive function to reverse
        // the list after removing the first element
        revlist(list);

        // now after the rest of the list has been
        // reversed by the upper recursive call,
        // add the first value at the end
        list.add(value);
    }

    public static void main(String[] args) {
        System.out.println(
                "Reverse order of given List :- ");

        List<String> gfg = new ArrayList<>(
                Arrays.asList("PLATFORM", "LEARNING", "BEST", "THE", "IS", "GFG"));

        revlist(gfg);

        System.out.println(gfg);
    }
}
