package home.amit.designpattern.behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> itemsList;

    public ShoppingCart() {
        this.itemsList = new ArrayList<>();

    }

    public void addItem(Item item) {
        itemsList.add(item);

    }


    public void removeItem(Item item) {
        itemsList.remove(item);

    }

    public int calculateTotal() {

        int sum = itemsList.stream().mapToInt(Item::getPrice).sum();
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

}