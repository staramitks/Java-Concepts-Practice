package home.amit.designpattern.structural.decorator;

public class SportsCar extends CarDecorator {


    public SportsCar(Car c) {
        super(c);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Features of sports car");
    }


}
