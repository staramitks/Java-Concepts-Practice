package home.amit.designpattern.behavioural.strategy;

public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item(10, "123410");
        Item item2 = new Item(90, "4098203");

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PayPalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy(123456789, 786, "Pankaj Kumar", "12/15"));
    }

}