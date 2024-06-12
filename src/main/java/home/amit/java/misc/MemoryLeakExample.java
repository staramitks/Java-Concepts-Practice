package home.amit.java.misc;
/*
User :- AmitSingh
Date :- 6/12/2024
Time :- 10:29 PM
Year :- 2024
*/

import home.amit.java.basic.dataprovider.Employee;
import home.amit.java8.enhancements.lambdas.EmployeeDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MemoryLeakExample {
    public static void main(String[] args) throws InterruptedException {
        List<EmployeeDTO> list = new ArrayList<>();
        Random random= new Random();
int i=0;
        while (true) {
            Thread.sleep(100);
            System.out.println("Adding "+ i++);
             list.add(new EmployeeDTO("1234", random.nextInt(100), "Amit", "Agra"));
        }
    }
}
