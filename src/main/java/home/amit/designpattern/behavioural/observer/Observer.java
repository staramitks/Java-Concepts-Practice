package home.amit.designpattern.behavioural.observer;

public interface Observer {
	
	public void consumeUpdate(String news);
	public void setSubject(Subject subject);

}
