package home.amit.java8.enhancements.lambdas;
/*
User :- AmitSingh
Date :- 6/23/2023
Time :- 9:23 PM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryUsingStreams {

    public static void main(String[] args) {

        Map<String,Integer> salaryMap= new HashMap<>();
        salaryMap.put("Amit",1000);
        salaryMap.put("Kumar",4000);
        salaryMap.put("Singh",6000);
        salaryMap.put("Akash",2000);
        salaryMap.put("Verma",4000);
        salaryMap.put("Vikas",10000);


        final List<Map.Entry<String, Integer>> collect = salaryMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toList());
        Map.Entry<String, Integer> secondLowestSalary = collect.get(1);
        System.out.println(secondLowestSalary);
        int mapSize=salaryMap.size();
        final List<Map.Entry<String, Integer>> collect2 = salaryMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toList());
        //2nd highest salary
        Map.Entry<String, Integer> secondHighestSalary = collect2.get(mapSize-2);
        System.out.println(secondHighestSalary);

        final List<Map.Entry<String, Integer>> revrseSorted = salaryMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toList());
        //2nd highest salary


    }
}
