package home.amit.designpattern.creational.abstractfactory;
/*
User :- AmitSingh
Date :- 7/4/2023
Time :- 10:05 PM
Year :- 2023
*/

public class AndroidDeveloper implements Employee {
    @Override
    public String getName() {
        return "Android Developer";
    }

    @Override
    public int getSalary() {
        return 1000;
    }
}
