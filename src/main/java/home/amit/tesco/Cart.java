package home.amit.tesco;
/*
User :- AmitSingh
Date :- 7/18/2023
Time :- 3:57 PM
Year :- 2023
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

    private List<ShoppingItem> items;


    public Cart(){
        items= new ArrayList<>();
    }

    public void addItem(ShoppingItem product)
    {
        items.add(product);
    }


    public void removeItem(ShoppingItem product)
    {
        items.remove(product);
    }

    public List<ShoppingItem> getItems()
    {
        return this.items;
    }

    public Map<String,Integer> getItemsGroupedByCategory() {

        Map<String, Integer> categoryMap= new HashMap<>();

        for (ShoppingItem p : this.getItems())
        {
            if (!categoryMap.containsKey(p.getCategory())) {
                categoryMap.put(p.getCategory(), p.getQuantity());
            }
            else
            {
                int qty=categoryMap.get(p.getCategory());
                categoryMap.put(p.getCategory(), qty+p.getQuantity());
            }
        }

        return categoryMap;


    }




}
