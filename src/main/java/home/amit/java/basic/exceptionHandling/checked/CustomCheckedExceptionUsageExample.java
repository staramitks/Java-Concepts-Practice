package home.amit.java.basic.exceptionHandling.checked;

import java.util.ArrayList;


// CHECKED Exception extend Exception or implement Throwable interface
public class CustomCheckedExceptionUsageExample {

    public static void main(String[] args) {
        CustomCheckedExceptionUsageExample lCustomCheckedException = new CustomCheckedExceptionUsageExample();
        try {
            lCustomCheckedException.testDay();
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Note that in case of checked exception function who is throwing exception is forced to declare it in the function by  throws exception
    // and the caller is again forced to handle it
    public void testDay() throws DayNotAvailableException {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");
        String day = "Sunday";

        if (!arrayList.contains(day)) {
            throw new DayNotAvailableException("Day not available", day);
        }

    }
}

