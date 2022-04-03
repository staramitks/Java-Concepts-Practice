package home.amit.java.defaultexamples;

public interface A {
	
	default void hello()
	{
		System.out.println("Hello from A");
	}

}
