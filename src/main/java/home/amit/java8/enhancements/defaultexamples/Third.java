package home.amit.java8.enhancements.defaultexamples;

public interface Third extends A {

    default void hello() {
        System.out.println("Hello from Third");
    }

}

