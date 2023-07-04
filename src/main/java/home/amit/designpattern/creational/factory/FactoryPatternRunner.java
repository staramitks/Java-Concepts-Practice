package home.amit.designpattern.creational.factory;


/*
 * When the client doesn't know implementing class and more than
 * Factory design pattern provides approach to code for interface rather than implementation.
 * Factory pattern provides abstraction between
 *  implementation and client classes through inheritance.
 * java.util.Calendar.getInstance, 
 * ResourceBundle.getBulde and 
 * NumberFormat getInstance() methods
 *  uses Factory pattern.
 *  Spring getBean
 * 
 */
public class FactoryPatternRunner {
	
	public static void main (String... args)
	{
		RatePlanFactory factory=new RatePlanFactory(RatePlanEnum.DOMESTIC);
		Plan p=factory.getPlan();
		System.out.println("Bill Amount is : "+factory.getPlan().getBill(100));
	}

}
