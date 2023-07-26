package home.amit.designpattern.behavioural.strategy;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditCardStrategy implements PaymentStrategy{

	private int cardNumber;
	private int cvvNumber;
	private String name;
	private String dateOfExp;

	@Override
	public void pay(int amount) {
		System.out.println("Paid with Credit Card");
		
	}

}
