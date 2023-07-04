package home.amit.designpattern.creational.abstractfactory;
/*
User :- AmitSingh
Date :- 7/4/2023
Time :- 10:18 PM
Year :- 2023
*/

public class Manager implements  Employee{

    @Override
    public String getName() {
        return "Manager";
    }

    @Override
    public int getSalary() {
        return 111000;
    }
}
