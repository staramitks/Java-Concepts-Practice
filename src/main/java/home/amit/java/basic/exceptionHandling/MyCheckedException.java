package home.amit.java.basic.exceptionHandling;


public class MyCheckedException extends Exception {

    private static final long serialVersionUID = -2872694086602732648L;

    private int id;

    MyCheckedException(String message) {
        super(message);

    }

    MyCheckedException(String message, String cause) {
        super(message, new Throwable(cause));

    }

    public MyCheckedException(String my_blah_blah_message, Exception e) {
    }

    @Override
    public String toString() {
        return String.format("MyCheckedException[%d]", this.id);
    }


}
