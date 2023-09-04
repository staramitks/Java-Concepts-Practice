package home.amit.designpattern.structural.composite;
/*
User :- AmitSingh
Date :- 6/25/2023
Time :- 5:06 PM
Year :- 2023
*/

public class CompositePatternRunner {
    public static void main(String[] args) {

        EmployeeComposite CEO = new EmployeeComposite("John", "CEO", 30000);

        EmployeeComposite headSales = new EmployeeComposite("Robert", "Head Sales", 20000);

        EmployeeComposite headMarketing = new EmployeeComposite("Michel", "Head Marketing", 20000);

        EmployeeComposite clerk1 = new EmployeeComposite("Laura", "Marketing", 10000);
        EmployeeComposite clerk2 = new EmployeeComposite("Bob", "Marketing", 10000);

        EmployeeComposite salesExecutive1 = new EmployeeComposite("Richard", "Sales", 10000);
        EmployeeComposite salesExecutive2 = new EmployeeComposite("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        CEO.getSubOrdinates().stream().forEach(e -> {
            System.out.println(e);
            e.getSubOrdinates().stream().forEach(s -> System.out.println(s));
        });

    }
}