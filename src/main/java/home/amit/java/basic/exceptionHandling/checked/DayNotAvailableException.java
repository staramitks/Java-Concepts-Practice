package home.amit.java.basic.exceptionHandling.checked;
/*
User :- AmitSingh
Date :- 6/23/2023
Time :- 7:27 AM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/

public class DayNotAvailableException extends Exception {

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