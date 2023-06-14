package home.amit.java.basic.map;

public class DefaultEnvProps {

    public static void main(String[] args) {

        System.out.println("****************************************************************");
        System.out.println("******* Java Vendor   **** -> " + System.getProperty("java.vendor"));
        System.out.println("******* Java Home     **** -> " + System.getProperty("java.home"));
        System.out.println("******* Java Version  **** -> " + System.getProperty("java.version"));
        System.out.println("******* OS Name       **** -> " + System.getProperty("os.name"));
        System.out.println("******* OS Version    **** -> " + System.getProperty("os.version"));
        System.out.println("******* User Name     **** -> " + System.getProperty("user.name"));
        System.out.println("****************************************************************");


    }
}
