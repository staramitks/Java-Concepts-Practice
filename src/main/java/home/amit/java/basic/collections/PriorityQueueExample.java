package home.amit.java.basic.collections;

import home.amit.java.basic.dataprovider.DataProvider;
import home.amit.java.basic.dataprovider.Employee;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


/*
 *
 * A PriorityQueue is used when the objects are supposed to be processed based on the priority.
 * It is known that a queue follows First-In-First-Out algorithm,
 * but sometimes the elements of the queue are needed to be processed according to the priority,
 * that’s when the PriorityQueue comes into play.
 * The PriorityQueue is based on the priority heap.
 * The elements of the priority queue are ordered according to the natural ordering,
 * or by a Comparator provided at queue construction time,
 * depending on which constructor is used
 *
 *
 */

public class PriorityQueueExample {

    public static void main(String... args) {

        PriorityQueue<Employee> empPriorityQueue = new PriorityQueue<>();
        List<Employee> employees = DataProvider.getEmployees();
        Collections.sort(employees);
        employees.stream().forEach(e -> System.out.println(e.getAge()));
        employees.stream().forEach(e -> empPriorityQueue.add(e));
        System.out.println("Length of priorityqueue elements is " + empPriorityQueue.size());
        empPriorityQueue.forEach(e -> System.out.println(e.getAge()));
        System.out.println("Top element in PriorityQueue is " + empPriorityQueue.peek().getAge());
        empPriorityQueue.poll();
        System.out.println("Second element in PriorityQueue is " + empPriorityQueue.peek().getAge());


    }

}
