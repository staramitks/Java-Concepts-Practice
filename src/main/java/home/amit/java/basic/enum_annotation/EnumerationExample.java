package home.amit.java.basic.enum_annotation;

enum Weekday{
    SUNDAY, MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

}
public class EnumerationExample {


    public static void main(String[] args) {

        Weekday weekday= Weekday.SUNDAY;

        //value of is an important function to convert from String to enum type object
        Weekday weekdayInput=Weekday.valueOf(args[0]);

        if (weekdayInput.equals(weekday))
        {
            System.out.println("Weekday is "+args[0]);
        }
        else
        {
            System.out.println("Some other day");
        }

    }
}
