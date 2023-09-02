package home.amit.java.basic.strings;
/*
User :- AmitSingh
Date :- 8/8/2023
Time :- 5:16 PM
Year :- 2023
*/


import java.util.Arrays;

public class Runner {

    private boolean isValidStatus(String status) {
        return Arrays.stream(TaskStatus.values())
                .anyMatch(taskStatus -> taskStatus.name().equals(status));
    }


    public static void main(String[] args) {

        Runner dto = new Runner();
        boolean result = dto.isValidStatus("BLOCKED");
        System.out.println(result);

    }

}
