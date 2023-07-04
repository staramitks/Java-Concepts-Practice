package home.amit.designpattern.behavioural.command.additional;
/*
User :- AmitSingh
Date :- 6/25/2023
Time :- 2:23 PM
Year :- 2023
*/

import java.util.ArrayList;
import java.util.List;

public class CommandRunner {
    public static void main(String[] args) {

        Stock buyStk= new Stock ("TCS",100.0);
        Stock sellStk= new Stock ("TCS",100.0);
        Order buyOrder=new BuyOrder(buyStk,100);
        Order sellOrder=new SellOrder(sellStk,100);
        Broker broker= new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);
        broker.placeOrders();




    }
}
