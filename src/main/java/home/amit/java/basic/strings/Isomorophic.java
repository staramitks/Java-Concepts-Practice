package home.amit.java.basic.strings;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Isomorophic {

    public boolean isIsomorphic(String s, String t)
    {
        if (s==null || t==null )
        {
            return false;
        }
        if(s.length()!=t.length())
        {
            return false;
        }

        if (s.length()==0 && t.length()==0)
        {
            return true;
        }

        HashMap<Character, Character> map= new HashMap<>();
        for (int i=0; i<s.length(); i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            Character c= getKey(map,c2);
            if (c!=null && c!=c1)
            {
                return false;
            }
            else if (map.containsKey(c1))
            {
                if (c2!= map.get(c1))
                {
                    return false;
                }
            }
            else
            {
                map.put(c1,c2);
            }
        }
        return true;

    }

    private Character getKey(HashMap<Character, Character> map, Character target) {
        for (Map.Entry<Character,Character> entry : map.entrySet())
        {
            if (entry.getValue().equals(target))
            {
                return entry.getKey();
            }
        }
     return null;
    }


    public static void main(String[] args) {
        Isomorophic isomorophic= new Isomorophic();
        boolean result=isomorophic.isIsomorphicTest("POLO","MONO");
        System.out.println(result);
    }


    public boolean isIsomorphicTest(String s1, String s2)
    {
        Map<String,Integer> vowelsMap= new HashMap<>();
        vowelsMap.put("A",1);
        vowelsMap.put("E",2);
        vowelsMap.put("I",3);
        vowelsMap.put("O",4);
        vowelsMap.put("U",5);
        s1=s1.toUpperCase(Locale.ROOT);
        s2=s2.toUpperCase(Locale.ROOT);
        char[] chars = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        StringBuffer s1Unique=new StringBuffer("");
        StringBuffer s2Unique=new StringBuffer("");
        for (int i=0;i<chars.length;i++)
        {
            String s=String.valueOf(chars[i]);
            s1Unique.append(getNumberInStr(vowelsMap,s));
        }
        for (int i=0;i<chars2.length;i++)
        {
            String s=String.valueOf(chars2[i]);
            s2Unique.append(getNumberInStr(vowelsMap,s));
        }
        if (s1Unique.toString().equals(s2Unique.toString()))
        {
            return true;
        }
        return false;
    }


    public String getNumberInStr(Map<String,Integer> vowelsMap, String Val)
    {
        if (vowelsMap.containsKey(Val))
        {
            return String.valueOf(vowelsMap.get(Val));
        }
        return "X";
    }
}
