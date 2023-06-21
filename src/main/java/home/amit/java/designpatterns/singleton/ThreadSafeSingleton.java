package home.amit.java.designpatterns.singleton;


/*


Breaking Singleton and ways to overcome that
1-	Reflection :- It can break singleton pattern by making constructor of singleton class public and creating objects out of it.
        a.	To avoid that use Enum which ensures that java only creates one object for enums without giving any handle of constructor.
2-	Cloning :- A singleton class implementing clone interface can potentially break singleton by using clone method if it implements Cloneable interface .
         a.	To avoid that either throw cloneNotSupportedException in the singleton class or simply return instance of the class which otherwise gets created by calling singleton.getInstance method.

3-	Serialization :-  Serialization where objects are saved in and can be retrieved can break singleton pattern.
        To avoid that simply override readResolve method to return same instance of class which gets returned otherwise in normal invocations.

Examples

	java.lang.Runtime#getRuntime()
	java.awt.Desktop#getDesktop()
   Double checked locking principle is used.
   In this approach, the synchronized block is used inside the
   if condition with an additional check to ensure that only one instance of singleton class is created.

 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
