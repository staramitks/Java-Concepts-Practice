package home.amit.designpattern.creational.abstractfactory;
/*
User :- AmitSingh
Date :- 7/4/2023
Time :- 10:24 PM
Year :- 2023

// This is particularly useful when we need to add new objects type of same type in factory pattern
since factory pattern alone can't do much on its own so it's better to have abstract factory pattern which would not take
specific parameter but an object of type abstract factory which would call getObject on Abstract Factory
So EmployeeFactory method and abstract factory main method will return employee objects
*/

// Abstract Product A
interface ProductA {
    void operationA();
}

// Concrete Product A1
class ConcreteProductA1 implements ProductA {
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA1 operationA");
    }
}

// Concrete Product A2
class ConcreteProductA2 implements ProductA {
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA2 operationA");
    }
}

// Abstract Product B
interface ProductB {
    void operationB();
}

// Concrete Product B1
class ConcreteProductB1 implements ProductB {
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB1 operationB");
    }
}

// Concrete Product B2
class ConcreteProductB2 implements ProductB {
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB2 operationB");
    }
}

// Abstract Factory
interface AbstractFactory {
    ProductA createProductA();

    ProductB createProductB();
}

// Concrete Factory 1
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

// Concrete Factory 2
class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

// Client code
public class AbstractFactoryCompleteExample {
    public static void main(String[] args) {
        // Create a concrete factory
        AbstractFactory factory = new ConcreteFactory1();

        // Create products using the factory
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();

        // Use the products
        productA.operationA();
        productB.operationB();
    }
}
