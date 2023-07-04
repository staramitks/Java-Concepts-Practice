package home.amit.designpattern.behavioural.chainofresponsibility;

public interface ChainDispenser {
	
	public void nextChain(ChainDispenser chain);
	public int dispenseCurrencyNotes(int money);

}
