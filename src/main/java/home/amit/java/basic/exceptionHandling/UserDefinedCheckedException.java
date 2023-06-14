package home.amit.java.basic.exceptionHandling;


public class UserDefinedCheckedException extends Exception {

    private static final long serialVersionUID = -2872694086602732648L;

    private final int id;

    UserDefinedCheckedException(int i, String message) {
        super(message);
        this.id = i;
    }

    UserDefinedCheckedException(int i, String message, String cause) {
        super(message, new Throwable(cause));
        this.id = i;
    }

    @Override
    public String toString() {
        return String.format("EmployeeNotFoundException[%d]", this.id);
    }

}