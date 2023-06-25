package home.amit.java8.enhancements.defaultexamples;

public interface FirstA {

    default void hello() {
        System.out.println("Hello from FirstA");
    }

}
