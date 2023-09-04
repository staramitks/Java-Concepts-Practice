package home.amit.designpattern.creational.abstractfactory;
/*
User :- AmitSingh
Date :- 7/4/2023
Time :- 10:07 PM
Year :- 2023
*/

public class EmployeeFactory {


    public Employee getEmployee(AbstractEmployeeFactory abstractEmployeeFactory) {
        return abstractEmployeeFactory.createEmployee();
    }
}
