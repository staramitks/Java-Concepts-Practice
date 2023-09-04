package home.amit.designpattern.behavioural.observer;

public class ObserverTestRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        GoogleNews news = new GoogleNews();
        Observer firstObserver = new GNewsObserver("Amit");
        Observer secondObs = new GNewsObserver("Yanshu");
        Observer thirdObs = new GNewsObserver("Vinit");
        news.registerObserver(firstObserver);
        news.registerObserver(secondObs);
        news.registerObserver(thirdObs);
        news.setNews("Chris Hemsworth star of Marvel Studio shows up with GF njoying in Malaysia");

    }

}
