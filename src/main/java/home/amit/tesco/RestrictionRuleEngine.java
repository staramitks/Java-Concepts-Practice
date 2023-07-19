package home.amit.tesco;
/*
User :- AmitSingh
Date :- 7/18/2023
Time :- 8:44 PM
Year :- 2023
*/

import java.util.List;
import java.util.Map;

public class RestrictionRuleEngine {

    private List<Restriction> restrictionRules;

    public RestrictionRuleEngine(List<Restriction> restrictionRules)
    {
        this.restrictionRules=restrictionRules;
    }


    public String applyRestrictions(Cart cartProducts)
    {

        Map<String, Integer> itemsGroupedByCategory = cartProducts.getItemsGroupedByCategory();

        String result="MET";


        for (Map.Entry<String, Integer> entry: itemsGroupedByCategory.entrySet())
        {
            for (Restriction rule:restrictionRules )
            {

                if (!rule.isValid(entry.getKey(), entry.getValue()))
                {
                    result="BREACHED";
                    break;
                }
            }


        }

        return result;


    }

}
