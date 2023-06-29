package home.amit.java.basic.map;
/*
User :- AmitSingh
Date :- 6/29/2023
Time :- 8:33 PM
Year :- 2023
*/

import java.util.HashMap;
import java.util.Map;

public class ReverseMapKeyValue {

    public static void main(String[] args) {

        Map<String,String> myMap= new HashMap<>();
        Map<String,String> reversedMap= new HashMap<>();
        myMap.put("Amit","SinghAmit");
        myMap.put("Aariana","SinghAarian");
        myMap.put("Shilpi","SinghShilpi");
        myMap.put("Akshat","SinghAkshat");
        myMap.put("Ashoka","KumariAshok");
        System.out.println("Initial Map is "+myMap);
        myMap.keySet().stream().forEach(k->reversedMap.put(myMap.get(k),k));
        System.out.println(reversedMap);


    }
}
