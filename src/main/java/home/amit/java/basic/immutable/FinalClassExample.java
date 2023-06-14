package home.amit.java.basic.immutable;

/*
 * Declare the class as final so it can’t be extended.
Make all fields private so that direct access is not allowed.
Don’t provide setter methods for variables
Make all mutable fields final so that it’s value can be assigned only once.
Initialize all the fields via a constructor performing deep copy.
Perform cloning of objects in the getter methods to return a copy rather 
than returning the actual object reference.
* Create defensive copies while creating and getting mutable objects

 * 
 */


import java.util.HashMap;
import java.util.Map;

public final class FinalClassExample {

    private final int id;
    private final String name;
    private final HashMap<String, String> testMap;

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    /**
     * Accessor function for mutable objects
     */
    public Map<String, String> getTestMap() {
        //return testMap;
        //Collections.unmodifiableMap(testMap);
        return
                (HashMap<String, String>) testMap.clone();

    }

    /**
     * Constructor performing Deep
     *
     * @param i
     * @param n
     * @param hm
     */

    public FinalClassExample(int i, String n, Map<String, String> hm) {
        System.out.println("Performing Deep  for Object initialization");
        this.id = i;
        this.name = n;
        var tempMap = new HashMap<String, String>();
//		String key;
//		Iterator<String> it = hm.keySet().iterator();
//		while(it.hasNext()){
//			key=it.next();
//			tempMap.put(key, hm.get(key));
//		}

        tempMap.putAll(hm);
        this.testMap = tempMap;
    }


    /**
     * Constructor performing Shallow
     * @param i
     * @param n
     * @param hm
     */
    /**
     public FinalClassExample(int i, String n, HashMap<String,String> hm){
     System.out.println("Performing Shallow  for Object initialization");
     this.id=i;
     this.name=n;
     this.testMap=hm;
     }
     */

    /**
     * To test the consequences of Shallow  and how to avoid it with Deep  for creating immutable classes
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> h1 = new HashMap<String, String>();
        h1.put("1", "first");
        h1.put("2", "second");

        String s = "original";

        int i = 10;

        FinalClassExample ce = new FinalClassExample(i, s, h1);

        //Lets see whether its copy by field or reference
        System.out.println(s == ce.getName());
        System.out.println(h1 == ce.getTestMap());
        //print the ce values
        System.out.println("ce id:" + ce.getId());
        System.out.println("ce name:" + ce.getName());
        System.out.println("ce testMap:" + ce.getTestMap());
        //change the local variable values
        i = 20;
        s = "modified";
        h1.put("3", "third");
        //print the values again
        System.out.println("ce id after local variable change:" + ce.getId());
        System.out.println("ce name after local variable change:" + ce.getName());
        System.out.println("ce testMap after local variable change:" + ce.getTestMap());

        Map<String, String> hmTest = ce.getTestMap();
        hmTest.put("4", "new");

        System.out.println("ce testMap after changing variable from accessor methods:" + ce.getTestMap());

    }

}
