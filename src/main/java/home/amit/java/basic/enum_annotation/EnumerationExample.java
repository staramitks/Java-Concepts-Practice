package home.amit.java.basic.enum_annotation;

enum Weekday {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public String toString()
    {
        switch (this)
        {
            case MONDAY:
                return "Sadly today is MONDAY";
            case TUESDAY:
                return "Better today is TUESDAY";
            case WEDNESDAY:
                return "Good today is WEDNESDAY";
            case THURSDAY:
                return "yaaa today is THURSDAY";
            case FRIDAY:
                return "Finally its FRIDAY";
            case SATURDAY:
                return "Enjoy as today is SATURDAY";
            case SUNDAY:
                return "Relaxing day as today it is SUNDAY";
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
