package home.amit.designpattern.behavioural.strategy;

public class PayPalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    @Override
    public void pay(int amount) {
        System.out.println("Paid with Paypal");

    }

    public PayPalStrategy(String emailId, String password) {
        super();
        this.emailId = emailId;
        this.password = password;
    }

    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
