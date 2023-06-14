package home.amit.java.basic.misc;

public class EnvVsVMProps {

    public static void main(String[] args) {

        System.out.println("Fetching env property ENVPROP1 " + System.getenv("ENVPROP1"));
        System.out.println("Fetching VM property VMPROP1 using System.getProperty " + System.getProperty("VMPROP1"));


        System.out.println("Fetching ENV  property ENVPROP2 using System.getProperty =>" + System.getProperty("ENVPROP2"));
        System.out.println("Fetching VM  property VMPROP2 using System.getEnv =>" + System.getenv("VMPROP2"));


    }
}
