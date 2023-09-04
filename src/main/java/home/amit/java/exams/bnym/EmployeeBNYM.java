package home.amit.java.exams.bnym;
/*
User :- AmitSingh
Date :- 7/31/2023
Time :- 11:38 AM
Year :- 2023
*/

import lombok.Data;

import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@Data
public class EmployeeBNYM {
    private Long employeeId;
    private Date birthDate;
    private String name;
    private String gender;
    private Long departmentId;

    public static void main(String[] args) {

        int[] arr = {2, 1, 6, 3, 7};
        EmployeeBNYM employeeBNYM = new EmployeeBNYM();
        employeeBNYM.bubbleSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private long getEmployeeCountByGender(String gender, Set<EmployeeBNYM> employees) {

        long countByGender = employees.stream().filter(e -> e.gender.equals(gender)).count();
        return countByGender;

    }

    void printNamesSortedByAge(Map<Long, EmployeeBNYM> empMap) {

        empMap.values().stream().sorted(Comparator.comparing(EmployeeBNYM::getBirthDate)).map(EmployeeBNYM::getName).forEach(System.out::println);

    }

    void getNameOfOldestMaleEmployee(Map<Long, EmployeeBNYM> employees) {
        employees.values().stream().filter(e -> e.getGender().equalsIgnoreCase("M"))
                .max(Comparator.comparing(EmployeeBNYM::getBirthDate))
                .map(EmployeeBNYM::getName)
                .ifPresentOrElse(
                        oldestMaleName -> System.out.println(oldestMaleName),
                        () -> System.out.println("No Employee Found")
                );

    }

    public void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }


        }


    }

}