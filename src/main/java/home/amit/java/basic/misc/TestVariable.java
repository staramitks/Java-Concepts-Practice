package home.amit.java.basic.misc;

public class TestVariable {
    public TestVariable() {
        number = 5;
    }

    public static void main(String[] args) {
        TestVariable egg = new TestVariable();
        System.out.println(egg.number);
    }

    public int number = 3;
    {
        number = 4;
    }
}

