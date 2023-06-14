package home.amit.java.basic.strings;

import java.util.Arrays;

public class StringExample {

    public void checkStringUpdate(String str) {
        str = "My new string";
        System.out.println("Inside function string is " + str);
    }

    public static void main(String[] args) {
        String str1 = "I Love Java";
        String str2 = "I Love Java";
        String str3 = "I Love Java";
        String str4 = "I Love Java";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        StringExample stringExample = new StringExample();
        stringExample.checkStringUpdate(str1);
        System.out.println(str1);

        int[] myArray = {1, 2, 3};
        System.out.println(Arrays.toString(myArray));

    }
}

