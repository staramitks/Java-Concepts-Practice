package home.amit.designpattern.behavioural.chainofresponsibility;

public interface ChainDispenser {
	
	void nextChain(ChainDispenser chain);
	int dispenseCurrencyNotes(int money);

}
