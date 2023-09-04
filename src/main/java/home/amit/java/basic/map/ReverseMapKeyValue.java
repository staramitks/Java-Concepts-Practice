package home.amit.java.basic.map;
/*
User :- AmitSingh
Date :- 6/29/2023
Time :- 8:33 PM
Year :- 2023
*/

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseMapKeyValue {

    public Map<String, String> reverseHashMapOption1(Map<String, String> myMap) {

        System.out.println("Initial Map reverseHashMapOption1 is " + myMap);
        Map<String, String> reversedMap = new HashMap<>();
        myMap.keySet().stream().forEach(k -> reversedMap.put(myMap.get(k), k));
        return reversedMap;
    }

    public Map<String, String> reverseHashMapOption2(Map<String, String> myMap) {

        System.out.println("reverseHashMapOption2 Map is " + myMap);
        return myMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

    }


    public static void main(String[] args) {

        ReverseMapKeyValue reverseMapKeyValue = new ReverseMapKeyValue();

        Map<String, String> myMap = new HashMap<>();
        Map<String, String> reversedMap = null;
        Map<String, String> reversedMap2 = null;
        myMap.put("Amit", "4");
        myMap.put("Aariana", "786");
        myMap.put("Shilpi", "75875");
        myMap.put("Akshat", "975876");
        myMap.put("Ashoka", "7467657");
        System.out.println("Initial Map is " + myMap);
        reversedMap = reverseMapKeyValue.reverseHashMapOption1(myMap);
        reversedMap.forEach((k, v) -> System.out.println(k + " -> " + v));


        System.out.println("SecondOption Map is " + myMap);
        reversedMap2 = reverseMapKeyValue.reverseHashMapOption2(myMap);
        reversedMap2.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
