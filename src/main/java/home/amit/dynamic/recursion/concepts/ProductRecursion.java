package home.amit.dynamic.recursion.concepts;
/*
User :- AmitSingh
Date :- 7/19/2023
Time :- 7:05 PM
Year :- 2023
*/

public class ProductRecursion {



    private int recursionProduct(int x, int y)
    {
        if (y==0)
        {
            return 0;
        }

        return  x + recursionProduct(x, y-1);

    }

    public static void main(String[] args) {

        ProductRecursion sumRecursion = new ProductRecursion();
        int product=sumRecursion.recursionProduct(10,20);
        System.out.println("Product  = "+product);

    }
}
