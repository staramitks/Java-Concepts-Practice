package home.amit.java.design.aggregate;
/*
User :- AmitSingh
Date :- 6/25/2023
Time :- 10:37 AM
Year :- 2023
Month :- 06
Month Name Short :- Jun

Link - https://www.geeksforgeeks.org/association-composition-aggregation-java/

Represented by Empty Diamond Symbol
<>

It is a special form of Association where:

It represents Has-A’s relationship.
It is a unidirectional association i.e. a one-way relationship. For example, a department can have students but vice versa is not possible
and thus unidirectional in nature.
In Aggregation, both entries can survive individually which means ending one entity will not affect the other entity.

*/

import java.util.HashSet;
import java.util.Set;


// Class 1
// Bank class
class Bank {

    // Attributes of bank
    private final String name;

    private Set<Employee> employees;

    // Constructor of this class
    Bank(String name) {
        // this keyword refers to current instance itself
        this.name = name;
    }

    // Method of Bank class
    public String getBankName() {
        // Returning name of bank
        return this.name;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Employee>
    getEmployees(Set<Employee> employees) {
        return this.employees;
    }
}

// Class 2
// Employee class
class Employee {
    // Attributes of employee
    private final String name;

    // Employee name
    Employee(String name) {
        // This keyword refers to current instance itself
        this.name = name;
    }

    // Method of Employee class
    public String getEmployeeName() {
        // returning the name of employee
        return this.name;
    }
}

// Class 3
// Association between both the
// classes in main method
class AggregationExample {

    // Main driver method
    public static void main(String[] args) {

        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");

        Set<Employee> employees = new HashSet<>();
        employees.add(emp);

        bank.setEmployees(employees);

        System.out.println(emp.getEmployeeName()
                + " belongs to bank "
                + bank.getBankName());
    }
}
