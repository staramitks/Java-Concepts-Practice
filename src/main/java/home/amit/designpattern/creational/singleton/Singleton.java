package home.amit.designpattern.creational.singleton;

class Singleton {

    private volatile static Singleton _instance;

    private Singleton() {
        // preventing Singleton object instantiation from outside
    }
    
    /* * 3rd version : An implementation of double checked locking of Singleton. *
     *  Intention is to minimize cost of synchronization and improve performance, * 
     *  
     *  
     *  
     *  
     *  by only locking critical section of code, the code which creates instance of 
     *  Singleton class. * By the way this is still broken, 
     *  if we don't make _instance volatile, as another thread can * see a half
     *   initialized instance of Singleton. */ 
    
    public static Singleton getInstanceDC() { 
    	if (_instance == null) { 
    		synchronized (Singleton.class) {
    			if (_instance == null) {
    				_instance = new Singleton();
    				}
    			}
    		} 
    	return _instance; 
    	}
    
}

    //Read more: https://javarevisited.blogspot.com/2014/05/double-checked-locking-on-singleton-in-java.html#ixzz5pUI4vVeL

