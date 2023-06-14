package home.amit.java.basic.map;

import java.util.HashMap;
import java.util.Map;

/*


Key will remain same but the value will be of last put hashmap value

 */
public class TestDummyMap {

    public static void main(String[] args) {
        EmployeeDummy dummy1 = new EmployeeDummy(1, "Amit", 10);
        EmployeeDummy dummy2 = new EmployeeDummy(2, "Mukesh", 20);
        EmployeeDummy dummy3 = new EmployeeDummy(3, "Suresh", 30);

        Map<EmployeeDummy, EmployeeDummy> employeeMap = new HashMap<>();
        employeeMap.put(dummy1, dummy1);
        employeeMap.put(dummy2, dummy2);
        employeeMap.put(dummy3, dummy3);

        System.out.println(employeeMap);
        //prints first object's key and last value

        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);
        map.put(1, 2);
        map.put(1, 3);

        System.out.println(map);


    }
}
