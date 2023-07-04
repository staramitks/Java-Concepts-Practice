package home.amit.designpattern.structural.adapter2;

//this class needs to adapt the target class or the class where we need to adapt
// it will have reference to the actual class which needs to adjust to new interfaces
public class TurkeyAdapter implements Duck{

	Turkey turkey;
	
	public  TurkeyAdapter(Turkey turk) {
			this.turkey=turk;
	}
	
	@Override
	public void quack() {

		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i=0;i<4;i++)
		{
		  turkey.fly();
		}
	}
}
