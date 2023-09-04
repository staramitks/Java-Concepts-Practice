package home.amit.designpattern.creational.abstractfactory;
/*
User :- AmitSingh
Date :- 7/4/2023
Time :- 10:15 PM
Year :- 2023
*/

public class AbstractFactoryClientRunner {

    public static void main(String[] args) {
        EmployeeFactory e = new EmployeeFactory();
        Employee emp = e.getEmployee(new WebDevFactory());
    }
}
