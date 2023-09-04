package home.amit.designpattern.creational.abstractfactory;
/*
User :- AmitSingh
Date :- 7/4/2023
Time :- 10:20 PM
Year :- 2023
*/

public class ManagerFactory extends AbstractEmployeeFactory {

    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
