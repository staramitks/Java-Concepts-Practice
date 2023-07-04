package home.amit.designpattern.behavioural.command.additional;
/*
User :- AmitSingh
Date :- 6/25/2023
Time :- 2:22 PM
Year :- 2023
*/

public class Stock {
    private String tickName;
    private double price;
    public Stock(String tick, double price)
    {
        this.tickName=tick;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickName='" + tickName + '\'' +
                ", price=" + price +
                '}';
    }
}
