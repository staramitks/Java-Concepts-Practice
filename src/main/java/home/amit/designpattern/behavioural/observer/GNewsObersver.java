package home.amit.designpattern.behavioural.observer;

public class GNewsObersver implements Observer {

	private Subject gnews;
	private String name;
	
	public  GNewsObersver(String name) {
		this.name=name;
}
	@Override
	public void consumeUpdate(String news) {
		System.out.println("News for Subscriber "+name +"is "+news);
	}
	@Override
	public void setSubject(Subject subject) {
		gnews=subject;
		
	}

}
