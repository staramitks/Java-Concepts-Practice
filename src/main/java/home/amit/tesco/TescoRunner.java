package home.amit.tesco;
/*
User :- AmitSingh
Date :- 7/18/2023
Time :- 3:40 PM
Year :- 2023
*/



/*

Tesco gets millions of orders every day with an average basket size of 100 items.
Tesco Business has got some regulations around selling products online and in stores.
These regulations are mandatory from legal and business perspective to enforce for all order transactions.

You are given an order with a list of products in the shopping cart/basket with productid, product Category and quantity.
And also, Restriction Rules on Qty and Qty/Category.

Example:

Ordered items in the shopping cart/basket

Item-1 -> productid=1, category=Paracetamol, quantity=3

Item-2 -> productid=2, category=analgesic, quantity=3

Item-3 -> productid=3, category=chocolate, quantity=8

Item-4 -> productid=4, category= Paracetamol, quantity=2

Business Restriction rules:

Cannot buy more than 10 Quantity of any products - BulkBuyLimit

Cannot buy more than 5 Quantity of paracetamol products – BulkBuyLimitCategory



Write a restriction rule engine to run the restriction check against the shopping cart/basket and return the status as to
MET/BREACHED indicating restriction status for the given restriction rules.

For the above given example, the restriction status returned would be MET.



 */

import java.util.*;


public class TescoRunner {
     public static void main(String[] args) {
        Cart cart= new Cart();
        cart.addItem(new ShoppingItem("1",TescoConstants.PARACETAMOL,3 ));
        cart.addItem(new ShoppingItem("2",TescoConstants.ANALEGESIC,10 ));
        cart.addItem(new ShoppingItem("3",TescoConstants.CHOCOLATE,8 ));
        cart.addItem(new ShoppingItem("4",TescoConstants.PARACETAMOL,2 ));


        Map<String, Integer> categoryMap= new HashMap<>();
        categoryMap.put(TescoConstants.PARACETAMOL,5);

        Restriction qtyRestriction= new QuantityRestriction(10);
        Restriction categoryRestriction= new CategoryRestriction(categoryMap);

        List<Restriction> restrictionRulesList= new ArrayList<>();
        restrictionRulesList.add(qtyRestriction);
        restrictionRulesList.add(categoryRestriction);

        RestrictionRuleEngine restrictionRuleEngine= new RestrictionRuleEngine(restrictionRulesList);

        String output=restrictionRuleEngine.applyRestrictions(cart);
        System.out.println("Output is "+output);

    }
}
