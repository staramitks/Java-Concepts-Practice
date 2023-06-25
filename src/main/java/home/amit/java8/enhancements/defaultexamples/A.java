package home.amit.java8.enhancements.defaultexamples;

public interface A {

    default void hello() {
        System.out.println("Hello from A");
    }

}
