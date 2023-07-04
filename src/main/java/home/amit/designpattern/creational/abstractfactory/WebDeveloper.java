package home.amit.designpattern.creational.abstractfactory;
/*
User :- AmitSingh
Date :- 7/4/2023
Time :- 10:05 PM
Year :- 2023
*/

public class WebDeveloper implements  Employee
{
    @Override
    public String getName() {
        return "Web Developer";
    }

    @Override
    public int getSalary() {
        return 2000;
    }
}
