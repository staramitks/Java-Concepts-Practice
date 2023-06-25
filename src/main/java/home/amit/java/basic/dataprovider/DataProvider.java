package home.amit.java.basic.dataprovider;

import home.amit.java8.enhancements.lambdas.EmployeeDTO;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static List<Employee> getEmployees() {
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setAge(20);
        emp1.setName("Amit");
        emp1.setCity("Mumbai");
        emp1.setSalary(20000);
        emp1.setCompany("MSCI");

        Employee emp2 = new Employee();
        emp2.setAge(21);
        emp2.setName("Amit1");
        emp2.setCity("Mumbai1");
        emp2.setSalary(210000);
        emp2.setCompany("MSCI");

        Employee emp3 = new Employee();
        emp3.setAge(22);
        emp3.setName("Singh");
        emp3.setCity("Mumbai2");
        emp3.setSalary(220000);
        emp3.setCompany("BlackRock");

        Employee emp4 = new Employee();
        emp4.setAge(23);
        emp4.setName("Kamal");
        emp4.setCity("Noida");
        emp4.setSalary(330000);
        emp4.setCompany("Greaves");

        Employee emp5 = new Employee();
        emp5.setAge(28);
        emp5.setName("Shah");
        emp5.setCity("Mumbai");
        emp5.setSalary(205000);
        emp5.setCompany("Citi");
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        return empList;
    }

    public static List<Person> getPersons() {
        List<Person> personList = new ArrayList<>();
        Person emp1 = new Person();
        emp1.setAge(20);
        emp1.setName("Amit");
        emp1.setCity("Mumbai");


        Person emp2 = new Person();
        emp2.setAge(21);
        emp2.setName("Amit1");
        emp2.setCity("Mumbai1");


        Person emp3 = new Person();
        emp3.setAge(22);
        emp3.setName("Singh");
        emp3.setCity("Mumbai2");

        Person emp4 = new Person();
        emp4.setAge(23);
        emp4.setName("Kamal");
        emp4.setCity("Noida");

        Employee emp5 = new Employee();
        emp5.setAge(28);
        emp5.setName("Shah");
        emp5.setCity("Mumbai");

        personList.add(emp1);
        personList.add(emp2);
        personList.add(emp3);
        personList.add(emp4);
        personList.add(emp5);
        return personList;


    }


    public static List<Integer> getIntList() {

        List<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(1);
        list.add(12);
        list.add(1333);
        list.add(13);
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(133);
        list.add(132);


        return list;
    }


    public List<EmployeeDTO> getEmployeesDTOList() {
        List<EmployeeDTO> empList = new ArrayList<>();
        EmployeeDTO emp1 = new EmployeeDTO("1234", "Amit", "Agra", 30);
        EmployeeDTO emp2 = new EmployeeDTO("2323", "sUMIT", "madra", 40);
        EmployeeDTO emp3 = new EmployeeDTO("12342", "aKAHASH", "Chennai", 50);
        EmployeeDTO emp4 = new EmployeeDTO("14334", "sHELLY", "Agartala", 60);
        EmployeeDTO emp5 = new EmployeeDTO("1234", "Shalu", "Agra", 90);
        EmployeeDTO emp6 = new EmployeeDTO("32213", "tinku", "Bangloare", 20);
        EmployeeDTO emp7 = new EmployeeDTO("870", "Vinit", "Bangalore", 25);
        EmployeeDTO emp8 = new EmployeeDTO("2389721", "Tam", "Punjab", 31);
        EmployeeDTO emp9 = new EmployeeDTO("2389721", "Amiadsat", "Agra", 32);
        EmployeeDTO emp10 = new EmployeeDTO("89709", "sddsd", "Agra", 33);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        empList.add(emp8);
        empList.add(emp9);
        empList.add(emp10);

        return empList;
    }


    public static int[] getArray() {

        int[] array = new int[]{2, 13, 1, 45, 23, 13, 41, 41, 11, 33, 11, 5, 6, 3, 56, 7, 43, 6, 76, 4, 54};
        return array;

    }

    public static int[] getSimpleArray() {

        int[] array = new int[]{4, 13, 8, 45};
        return array;

    }

}
