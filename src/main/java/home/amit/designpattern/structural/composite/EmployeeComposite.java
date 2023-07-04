package home.amit.designpattern.structural.composite;
/*
User :- AmitSingh
Date :- 6/25/2023
Time :- 5:05 PM
Year :- 2023
*/

import java.util.ArrayList;
import java.util.List;

public class EmployeeComposite {
    private String name;
    private String dept;
    private int salary;
    private List<EmployeeComposite> subordinates;

    // constructor
    public EmployeeComposite(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<EmployeeComposite>();
    }

    public void add(EmployeeComposite e) {
        subordinates.add(e);
    }

    public void remove(EmployeeComposite e) {
        subordinates.remove(e);
    }

    public List<EmployeeComposite> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("EmployeeComposite :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}