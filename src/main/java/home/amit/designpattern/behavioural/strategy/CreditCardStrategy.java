package home.amit.designpattern.behavioural.strategy;

public class CreditCardStrategy implements PaymentStrategy{

	private int cardNumber;
	private int cvvNumber;
	private String name;
	private String dateOfExp;
	
	public CreditCardStrategy(int cardNumber, int cvvNumber, String name, String dateOfExp) {
		super();
		this.cardNumber = cardNumber;
		this.cvvNumber = cvvNumber;
		this.name = name;
		this.dateOfExp = dateOfExp;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println("Paid with Credit Card");
		
	}


	/**
	 * @return the cardNumber
	 */
	public int getCardNumber() {
		return cardNumber;
	}


	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}


	/**
	 * @return the cvvNumber
	 */
	public int getCvvNumber() {
		return cvvNumber;
	}


	/**
	 * @param cvvNumber the cvvNumber to set
	 */
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the dateOfExp
	 */
	public String getDateOfExp() {
		return dateOfExp;
	}


	/**
	 * @param dateOfExp the dateOfExp to set
	 */
	public void setDateOfExp(String dateOfExp) {
		this.dateOfExp = dateOfExp;
	}


	
	
	

}
