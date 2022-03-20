package home.amit.java.basic.generics;


// Java program to show working of user defined
// Generic functions

public class GenericMethod {
    // A Generic method example
    public  <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    // Driver method
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        GenericMethod genericMethod= new GenericMethod();
        genericMethod.genericDisplay(11);

        // Calling generic method with String argument
        genericMethod.genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        genericMethod.genericDisplay(1.0);
    }
}
