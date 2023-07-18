package home.amit.tesco.fixed;
/*
User :- AmitSingh
Date :- 7/18/2023
Time :- 8:33 PM
Year :- 2023
*/

import java.util.Map;

public interface Restriction {

    boolean isValid(String product, int qty);
}
