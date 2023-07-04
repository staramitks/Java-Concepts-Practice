package home.amit.designpattern.structural.decorator;

public class CarDecorator implements Car{

	private Car car;
	
	
	public  CarDecorator(Car c) {
		this.car=c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	

}
