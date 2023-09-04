package home.amit.designpattern.structural.decorator;


/*
 * Examples include primarily java.io package where classes are like InputStream /
 *  BufferedInputStream
 *
 *  Behaviour is decided at run time and not at compile time
 *
 *  Instead of merely extending class with LuxuryCard and SportsCar we decide at runtime on what
 *  we want to build by passing Car parameters with constructors arguments
 *
 */
public class DecoratorRunner {


    public static void main(String[] args) {
        Car c = new SportsCar(new LuxuryCar(new BasicCar()));
        c.assemble();

        Car c2 = new SportsCar(new BasicCar());
        c2.assemble();


    }
}
