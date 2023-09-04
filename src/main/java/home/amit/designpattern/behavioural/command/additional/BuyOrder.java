package home.amit.designpattern.behavioural.command.additional;
/*
User :- AmitSingh
Date :- 6/25/2023
Time :- 2:19 PM
Year :- 2023
*/

public class BuyOrder implements Order {

    private final Stock stock;
    private final int qty;

    public BuyOrder(Stock stk, int qty) {
        this.stock = stk;
        this.qty = qty;
    }

    private void executeBuyOrder() {
        System.out.println("Buying " + stock + " qty=" + qty);
    }

    @Override
    public void execute() {
        this.executeBuyOrder();

    }
}
