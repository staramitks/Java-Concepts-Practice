package home.amit.designpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class GoogleNews implements Subject {

	private String news;
	private List<Observer> subscribers;
	
	
	public GoogleNews()
	{
		subscribers= new ArrayList<>();
	}
	@Override
	public void registerObserver(Observer o) {
		subscribers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		subscribers.remove(o);
	}

	@Override
	public void notifyObservers() {
		subscribers.stream().forEach(s->s.consumeUpdate(news));

	}
	
	public void setNews(String news)
	{
		this.news=news;
		notifyObservers();
	}

}
