package home.amit.java.basic.exceptionHandling.checked;

import java.util.ArrayList;


// CHECKED Exception extend Exception or implement Throwable interface
public class CustomCheckedException {


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
        System.out.println("Next Processing");

    }


    public static void main(String[] args) {
        CustomCheckedException lCustomCheckedException = new CustomCheckedException();
        try {
            lCustomCheckedException.testDay();
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }
}


class DayNotAvailableException extends Exception {

    private String day;

    public DayNotAvailableException() {
        super();
    }

    public DayNotAvailableException(String message, String day) {
        super(message);
        this.day = day;
    }

    public DayNotAvailableException(String message, String day, Throwable cause) {
        super(message, cause);
        this.day = day;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " for the day :" + day;
    }

    @Override
    public String getLocalizedMessage() {
        return "The day " + day + " is not available.";
    }
}