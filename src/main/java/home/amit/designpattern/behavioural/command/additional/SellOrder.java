package home.amit.designpattern.behavioural.command.additional;
/*
User :- AmitSingh
Date :- 6/25/2023
Time :- 2:19 PM
Year :- 2023
*/

public class SellOrder implements Order {

    private final Stock stock;
    private final int qty;

    public SellOrder(Stock stk, int qty) {
        this.stock = stk;
        this.qty = qty;
    }

    private void executeSellOrder() {
        System.out.println("Selling " + stock + " qty=" + qty);
    }

    @Override
    public void execute() {
        this.executeSellOrder();

    }
}
