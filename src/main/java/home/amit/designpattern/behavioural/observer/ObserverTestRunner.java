package home.amit.designpattern.behavioural.observer;

public class ObserverTestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoogleNews news=new GoogleNews();
		Observer firstObserver=new GNewsObersver("Amit");
		Observer secondObs=new GNewsObersver("Yanshu");
		Observer thirdObs=new GNewsObersver("Vinit");
		news.registerObserver(firstObserver);
		news.registerObserver(secondObs);
		news.registerObserver(thirdObs);
		news.setNews("XYZ Show dead");
		
	}

}
