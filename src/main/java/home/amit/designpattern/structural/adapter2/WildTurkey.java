package home.amit.designpattern.structural.adapter2;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {

        System.out.println("Long Fly");
    }

}
