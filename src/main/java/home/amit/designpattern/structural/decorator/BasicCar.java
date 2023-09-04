package home.amit.designpattern.structural.decorator;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Basic Car");
    }

}
