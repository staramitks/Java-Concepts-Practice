package home.amit.designpattern.structural.adapter2;

/*
 * 
 * The Adapter pattern converts the interface of a class into  another interce the client
 * expected. Adapter lets clsses work together that coldnt otherwise beacuse of
 * incompatible interface
 * 
 * This pattern involves a single class which is responsible to join functionalities of 
 * independent or incompatible interfaces. A real life example could be a case of card
 *  reader which acts as an adapter between memory card and a laptop. 
 *  You plugin the memory card into card reader and card reader into the laptop so that 
 *  memory card can be read via laptop.
	java.util.Arrays#asList()
	java.util.Collections#list()
	java.util.Collections#enumeration()
	java.io.InputStreamReader(InputStream) (returns a Reader)
java.io.OutputStreamWriter(OutputStream) (returns a Writer)

 * 
 * 
 */
public class AdapterTester {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        System.out.println("Turkey Says...");
        turkey.gobble();
        turkey.fly();


        System.out.println("Duck Says....");
        duck.quack();
        duck.fly();

        System.err.println("Adapter duck says..");
        Duck adapter = new TurkeyAdapter(turkey);
        adapter.fly();
        adapter.quack();

    }

}
