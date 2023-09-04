package home.amit.designpattern.creational.factory;

public abstract class Plan {

    protected double rate;

    public double getBill(int units) {
        return getRate() * units;
    }

    protected abstract double getRate();

}
