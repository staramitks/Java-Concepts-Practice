package home.amit.designpattern.structural.decorator;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car c) {
        super(c);
    }


    public void assemble() {
        super.assemble();
        System.out.println("Assembling Luxury Car");
    }
}
