package home.amit.java.basic.strings;

public class StringExample {
    public static void main(String[] args) {
        String str1 = new String("I Love Java");
        String str2 = new String("I Love Java");
        String str3 = "I Love Java";
        String str4 = "I Love Java";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

    }
}

