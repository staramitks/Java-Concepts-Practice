package home.amit.java.exams.tesco;
/*
User :- AmitSingh
Date :- 7/18/2023
Time :- 8:34 PM
Year :- 2023
*/

public class QuantityRestriction implements Restriction {

    private int qty;
    public QuantityRestriction(int qty)
    {
        this.qty=qty;
    }

    @Override
    public boolean isValid(String product, int boughtQty) {
     return boughtQty<=this.qty;
  }
}
