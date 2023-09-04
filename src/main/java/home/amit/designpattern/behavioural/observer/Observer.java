package home.amit.designpattern.behavioural.observer;

public interface Observer {

    void consumeUpdate(String news);

    void setSubject(Subject subject);

}
