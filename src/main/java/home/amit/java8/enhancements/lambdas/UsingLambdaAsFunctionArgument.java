package home.amit.java8.enhancements.lambdas;
/*
User :- AmitSingh
Date :- 6/24/2023
Time :- 9:56 AM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/


import home.amit.java.basic.dataprovider.DataProvider;
import home.amit.java.basic.dataprovider.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class UsingLambdaAsFunctionArgument {
    public static void main(String[] args) {
        List<Employee> list = DataProvider.getEmployees();
        final List<Employee> collect = list.stream().filter(e -> e.getSalary() > 20000).collect(Collectors.toList());
        System.out.println(collect);


    }


}
