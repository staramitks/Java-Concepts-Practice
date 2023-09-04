package home.amit.designpattern.creational.abstractfactory;
/*
User :- AmitSingh
Date :- 7/4/2023
Time :- 10:13 PM
Year :- 2023
*/

public class WebDevFactory extends AbstractEmployeeFactory {

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
