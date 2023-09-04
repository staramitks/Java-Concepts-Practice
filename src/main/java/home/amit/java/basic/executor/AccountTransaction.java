package home.amit.java.basic.executor;

/**
 * @author singami2
 */
public class AccountTransaction {

    private final Account account;

    public AccountTransaction(Account acnt) {
        this.account = acnt;
    }


    public void withdraw(long amount) {

        synchronized (this) {
            while (account.getBalance() < amount) {

                System.out.println("Less balance so holding withdrawal now...");
                try {
                    System.out.println("Waiting for 1 seconds for balance to be updated");
                    this.wait(1000);
                    if (account.getBalance() < amount) {
                        System.out.println("ERROR => INSUFFICIENT BALANCE");
                    }
                } catch (InterruptedException e) {
                    System.out.println("Exception encountered while waiting for amount to be credited " + e);
                    e.printStackTrace();
                }
            }
            System.out.println("Allowing withdrawal now...");
            account.setBalance(account.getBalance() - amount);
        }
    }


    public void deposit(long amount) {
        synchronized (this) {
            System.out.println("Depositing money and notifying other waiting threads ");
            account.setBalance(account.getBalance() + amount);
            notifyAll();
        }
    }


    public synchronized double getBalance() {

        return account.getBalance();


    }
}
