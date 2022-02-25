package home.amit.java.basic.exceptionHandling.unchecked;


import home.amit.java8.defaultexamples.C;

import java.util.ArrayList;


// UNCHECKED Exception extend RunTimeException
// RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.
// A method is not required to declare in its throws clause any subclasses of RuntimeException that might be thrown
// during the execution of the method but not caught.

public class CustomUnCheckedException {


    // Note that in case of checked exception function who is throwing excpetion is forces to declare it using throws exception
    // and the called is again forced to handle it
    public void testDay()
    {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");
        String day = "Sunday";

        if (!arrayList.contains(day))
        {
            throw new DayNotExistsRTException("Day not available", day);
        }
        System.out.println("Next Processing");

    }


    public static void main(String[] args) {

        CustomUnCheckedException lDayNotExistsRTException= new CustomUnCheckedException();
        lDayNotExistsRTException.testDay();

    }
}


class DayNotExistsRTException extends RuntimeException {

    private String day;

    public DayNotExistsRTException() {
        super();
    }

    public DayNotExistsRTException(String message, String day) {
        super(message);
        this.day = day;
    }

    public DayNotExistsRTException(String message, String day, Throwable cause) {
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
        return "The day "+day + " is not available.";
    }
}