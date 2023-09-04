package home.amit.designpattern.behavioural.observer;

public class GNewsObserver implements Observer {

    private Subject gnews;
    private final String name;

    public GNewsObserver(String name) {
        this.name = name;
    }

    @Override
    public void consumeUpdate(String news) {
        System.out.println("News for Subscriber " + name + "is " + news);
    }

    @Override
    public void setSubject(Subject subject) {
        gnews = subject;

    }

}
