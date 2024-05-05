package home.amit.java8.streams;
/*
User :- AmitSingh
Date :- 5/4/2024
Time :- 5:20 PM
Year :- 2024
*/


import home.amit.java.basic.dataprovider.DataProvider;
import home.amit.java.basic.dataprovider.Employee;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// To stream numbers from a stream
public class StreamingData {
    public static void main (String[] args) {

        // Stream.iterate
        UnaryOperator<Integer> incremental=n->n+2;
        Stream.iterate(1,incremental).limit(100).forEach(System.out::println );


        List<Employee> employees= DataProvider.getEmployees();
        Double employeeAvgSalaryDbl=employees.stream().mapToDouble(Employee::getSalary)
                .boxed()
                .collect(Collectors.averagingDouble(Double::doubleValue));

        System.out.println(employeeAvgSalaryDbl);

        Long employeeAvgSalary=employees.stream().mapToDouble(Employee::getSalary)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.averagingDouble(Double::doubleValue),Math::round
                ));
        System.out.println(employeeAvgSalary);

        List<Integer> listNos=List.of(1,2,3,4,4,5,5,6,6,6,6,4,34,223,232,423,5345,345);
        System.out.println("Testing takewhile");
        listNos.stream().takeWhile(n->n<100).forEach(System.out::println);

        System.out.println("Testing dropWhile");
        listNos.stream().dropWhile(n->n==423).forEach(System.out::println);

        Map<String,Integer> result=listNos.stream().collect(Collectors.teeing(
                Collectors.maxBy(Integer::compareTo),
                Collectors.minBy(Integer::compareTo),
                (e1,e2)-> Map.of("max",e1.get(),"min",e2.get() )
        ));

        System.out.println(result);


        Map<Boolean, List<Integer>> collect = listNos.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);

    }
}
