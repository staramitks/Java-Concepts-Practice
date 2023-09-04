package home.amit.designpattern.structural.proxy;


/*
The Proxy Design Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it.
It allows you to add an extra level of control and functionality while keeping the interface of the original object intact.
The Proxy Pattern is useful in scenarios where you want to control access to an object, implement lazy initialization, add logging or security checks,
 or provide a simplified interface to a complex object.
*/

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println();

        //image will not be loaded from disk
        image.display();
    }
}