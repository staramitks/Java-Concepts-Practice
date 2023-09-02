package home.amit.java.basic.collections;
/*
User :- AmitSingh
Date :- 8/3/2023
Time :- 7:39 PM
Year :- 2023
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListReverse {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("This","Is","Amit","Kumar","Singh");
        Collections.sort(list);
        Collections.reverse(list);
        list.stream().forEach(System.out::println);

        final List<String> collect = list.stream().sorted()
                .collect(Collectors.collectingAndThen(Collectors.toList(), listup -> {
                    Collections.reverse(listup);
                    return listup;
                }));
        System.out.println(collect);


    }
}
