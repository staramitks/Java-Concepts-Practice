package home.amit.designpattern.behavioural.chainofresponsibility;

public class FiveHundredRupees implements ChainDispenser {

	ChainDispenser nextChain;
	@Override
	public void nextChain(ChainDispenser chain) {
		// TODO Auto-generated method stub
		nextChain=chain;
	}

	@Override
	public int dispenseCurrencyNotes(int money) {
		int twokNotes=money/500;
		int remaining=money%500;
		nextChain.dispenseCurrencyNotes(remaining);
	    System.out.println("Five Hundred notes "+twokNotes);
	    return twokNotes;
	}

}
