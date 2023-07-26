package home.amit.java.exams.tesco;
/*
User :- AmitSingh
Date :- 7/18/2023
Time :- 3:45 PM
Year :- 2023
*/

import java.util.Objects;

public class ShoppingItem {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingItem product = (ShoppingItem) o;
        return quantity == product.quantity && Objects.equals(productId, product.productId) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, category, quantity);
    }

    private String productId;
    private String category;
    private int quantity;

    public ShoppingItem(String productId, String category, int quantity) {
        this.productId = productId;
        this.category = category;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
