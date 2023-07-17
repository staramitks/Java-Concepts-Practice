package home.amit.lastrepeatingcharacter;
/*
User :- AmitSingh
Date :- 7/14/2023
Time :- 5:53 PM
Year :- 2023
*/

import java.io.CharConversionException;
import java.util.*;

public class LastRepeatingCharacter {

    public char findLastRepeatingCharacter(String s)
    {
        Map<Character, Integer> charIndexMap=new HashMap<>();
        char[] array=s.toCharArray();
        for (int i=0; i<array.length;i++)
        {
            char val=array[i];
            if (charIndexMap.containsKey(array[i]))
            {
                charIndexMap.put(val,i);
            }
            else
            {
                charIndexMap.put(val,-1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = charIndexMap.entrySet();
        int maxval=-1;
        char lastRepeatingKey='0';

        for (Map.Entry<Character, Integer> kv : entries )
        {
            if (kv.getValue()>maxval)
            {
                maxval=kv.getValue();
                lastRepeatingKey=kv.getKey();
            }

        }

        return lastRepeatingKey;

    }



    public static void main(String[] args) {

        LastRepeatingCharacter lastRepeatingCharacter= new LastRepeatingCharacter();
        List<String> list= new ArrayList<>();
        list.add("missisipisi");
        list.add("osttra");
        for (String s: list)
        {
            Character output=lastRepeatingCharacter.findLastRepeatingCharacter(s);
            System.out.println("Output for "+s +" is "+output);
        }
    }
}
