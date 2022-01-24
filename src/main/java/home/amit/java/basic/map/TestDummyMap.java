package home.amit.java.basic.map;

import java.util.HashMap;
import java.util.Map;

public class TestDummyMap {

    public static void main(String[] args) {
        EmployeeDummy dummy1= new EmployeeDummy(1,"Amit",10);
        EmployeeDummy dummy2= new EmployeeDummy(2,"Amit",20);
        EmployeeDummy dummy3= new EmployeeDummy(3,"Amit",30);

        Map<EmployeeDummy, Integer> employeeMap = new HashMap<>();
        employeeMap.put(dummy1,1);
        employeeMap.put(dummy2,2);
        employeeMap.put(dummy3,3);

        System.out.println(employeeMap);
        //prints first object's key and last value



    }
}
