package home.amit.java.basic.abstractInterface;

public interface TestInterface {
    Integer id = 0;
    //private int year;

    void hello();

    default int getResult() {
        int i = 10;
        return i;
    }


}
