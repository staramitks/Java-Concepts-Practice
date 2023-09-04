package home.amit.designpattern.behavioural.observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
