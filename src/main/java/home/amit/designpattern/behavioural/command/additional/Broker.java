package home.amit.designpattern.behavioural.command.additional;
/*
User :- AmitSingh
Date :- 6/25/2023
Time :- 2:29 PM
Year :- 2023
*/

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        orderList.parallelStream().forEach(o->o.execute());
        orderList.clear();
    }
}