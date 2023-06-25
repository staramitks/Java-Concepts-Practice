package home.amit.java.basic.enum_annotation;

enum Weekday {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public String toString()
    {
        switch (this)
        {
            case MONDAY:
                return "Sadly today is Monday";
            case TUESDAY:
                return "Sadly today is TUESDAY";
            case WEDNESDAY:
                return "Sadly today is WEDNESDAY";
            case THURSDAY:
                return "Sadly today is Monday";
            case FRIDAY:
                return "Sadly today is FRIDAY";
            case SATURDAY:
                return "Sadly today is SATURDAY";
            case SUNDAY:
                return "Sadly today is SUNDAY";
            default:
                return "couldnt find day";

        }
    }

}

public class EnumerationExample {


    public static void main(String[] args) {

        Weekday weekday = Weekday.MONDAY;


        if (weekday.equals(weekday)) {
            System.out.println("Weekday is " + weekday);
        } else {
            System.out.println("Some other day");
        }

    }
}
