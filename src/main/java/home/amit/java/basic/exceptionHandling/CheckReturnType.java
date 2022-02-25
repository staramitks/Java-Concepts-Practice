//package home.amit.java.basic.exceptionHandling;
//
//import java.io.File;
//
//public class CheckReturnType implements EmployeeProvider{
//
//	public int checkReturnType() {
//
//
//		try {
//			return 1;
//		}
//		catch (Exception e)
//		{
//			return 2;
//		}
//		finally
//		{
//			return 3;
//		}
//		//return 4;
//	}
//
//
//	public int getValue()
//	{
//
//
//
//	}
//	public static void main (String args[])
//	{
//		CheckReturnType checkReturnType= new CheckReturnType();
//		int val = checkReturnType.checkReturnType();
//		System.out.println("Value is "+val);
//	}
//
//
//	@Override
//	public int getEmployeeData() throws MyCheckedException {
//		System.out.println("Processing getEmployeeData");
//		try {
//			System.out.println("Inside try");
//			File f= new File("C:/amit");
//
//		}
//		catch (Exception e)
//		{
//			throw new MyCheckedException("My Blah Blah message", e.getMessage());
//		}
//		finally{
//
//		}
//		return 0;
//	}
//}
