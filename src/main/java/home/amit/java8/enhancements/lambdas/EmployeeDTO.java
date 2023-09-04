package home.amit.java8.enhancements.lambdas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private String empId;
    private int age;
    private String name;
    private String city;

    public List<EmployeeDTO> getEmployeesList() {
        List<EmployeeDTO> empList = new ArrayList<>();
        EmployeeDTO emp1 = new EmployeeDTO("1234", 30, "Amit", "Agra");
        EmployeeDTO emp2 = new EmployeeDTO("2323", 41, "sUMIT", "madra");
        EmployeeDTO emp3 = new EmployeeDTO("12342", 43, "aKAHASH", "Chennai");
        EmployeeDTO emp4 = new EmployeeDTO("14334", 20, "sHELLY", "Agartala");
        EmployeeDTO emp5 = new EmployeeDTO("1234", 23, "Shalu", "Agra");
        EmployeeDTO emp6 = new EmployeeDTO("32213", 33, "tinku", "Bangloare");
        EmployeeDTO emp7 = new EmployeeDTO("870", 40, "Vinit", "Bangalore");
        EmployeeDTO emp8 = new EmployeeDTO("2389721", 33, "Tam", "Punjab");
        EmployeeDTO emp9 = new EmployeeDTO("2389721", 34, "Amiadsat", "Agra");
        EmployeeDTO emp10 = new EmployeeDTO("89709", 36, "sddsd", "Agra");
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


}
