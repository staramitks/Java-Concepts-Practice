package home.amit.java.basic.exceptionHandling;

public class HandleUnCheckedException {




    public static void main(String[] args) {

        Object obj=null;
        try {
            int code = obj.hashCode();
        }
        catch (Exception e)
        {
            System.out.println("Exception encountered "+e);
        }
        finally{
            System.out.println("Inside Finally Block");
        }


    }
}
