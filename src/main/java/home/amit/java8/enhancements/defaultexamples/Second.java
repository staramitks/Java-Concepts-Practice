package home.amit.java8.enhancements.defaultexamples;

public interface Second extends A {
    default void hello() {
        System.out.println("Hello from Second");
    }
}

