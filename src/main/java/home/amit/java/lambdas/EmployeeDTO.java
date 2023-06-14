package home.amit.java.lambdas;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO {
    private String empId;
    private int age;
    private String name;
    private String city;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String empId, String name, String city, int age) {
        super();
        this.empId = empId;
        this.name = name;
        this.city = city;
        this.setAge(age);
    }

    /**
     * @return the empId
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "EmployeeDTO [empId=" + empId + ", name=" + name + ", city=" + city + "]";
    }

    public List<home.amit.java.lambdas.EmployeeDTO> getEmployeesList() {
        List<home.amit.java.lambdas.EmployeeDTO> empList = new ArrayList<>();
        home.amit.java.lambdas.EmployeeDTO emp1 = new home.amit.java.lambdas.EmployeeDTO("1234", "Amit", "Agra", 30);
        home.amit.java.lambdas.EmployeeDTO emp2 = new home.amit.java.lambdas.EmployeeDTO("2323", "sUMIT", "madra", 40);
        home.amit.java.lambdas.EmployeeDTO emp3 = new home.amit.java.lambdas.EmployeeDTO("12342", "aKAHASH", "Chennai", 50);
        home.amit.java.lambdas.EmployeeDTO emp4 = new home.amit.java.lambdas.EmployeeDTO("14334", "sHELLY", "Agartala", 60);
        home.amit.java.lambdas.EmployeeDTO emp5 = new home.amit.java.lambdas.EmployeeDTO("1234", "Shalu", "Agra", 90);
        home.amit.java.lambdas.EmployeeDTO emp6 = new home.amit.java.lambdas.EmployeeDTO("32213", "tinku", "Bangloare", 20);
        home.amit.java.lambdas.EmployeeDTO emp7 = new home.amit.java.lambdas.EmployeeDTO("870", "Vinit", "Bangalore", 25);
        home.amit.java.lambdas.EmployeeDTO emp8 = new home.amit.java.lambdas.EmployeeDTO("2389721", "Tam", "Punjab", 31);
        home.amit.java.lambdas.EmployeeDTO emp9 = new home.amit.java.lambdas.EmployeeDTO("2389721", "Amiadsat", "Agra", 32);
        home.amit.java.lambdas.EmployeeDTO emp10 = new home.amit.java.lambdas.EmployeeDTO("89709", "sddsd", "Agra", 33);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
