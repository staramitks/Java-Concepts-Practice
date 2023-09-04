package home.amit.java.exams.tesco;
/*
User :- AmitSingh
Date :- 7/18/2023
Time :- 8:35 PM
Year :- 2023
*/

import java.util.Map;

public class CategoryRestriction implements Restriction {

    Map<String, Integer> restrictedMap;

    public CategoryRestriction(Map<String, Integer> restrictedMap) {
        this.restrictedMap = restrictedMap;
    }

    @Override
    public boolean isValid(String product, int qty) {
        if (restrictedMap.containsKey(product)) {
            return restrictedMap.get(product) >= qty;
        }
        return true;
    }
}
