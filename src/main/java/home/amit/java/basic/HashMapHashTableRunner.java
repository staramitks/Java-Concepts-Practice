package home.amit.java.basic;
/*
User :- AmitSingh
Date :- 7/30/2023
Time :- 9:17 PM
Year :- 2023
*/

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

// Hashtable doesn't allow even single null key or null value while hashmap allows it


public class HashMapHashTableRunner {

    private void testHashTable() {
        Hashtable<String, String> myht = new Hashtable<>();
        myht.put("Test", "123");
        myht.put("Test2", null);
    }


    private void testHashMap() {
        Map<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Test", "123");
        myHashMap.put("Test2", null);
        myHashMap.put(null, "Blas");
        System.out.println(myHashMap.get(null));
    }


    public static void main(String[] args) {
        HashMapHashTableRunner lHashMapHashTableRunner = new HashMapHashTableRunner();
        lHashMapHashTableRunner.testHashMap();
        lHashMapHashTableRunner.testHashTable();


    }
}
