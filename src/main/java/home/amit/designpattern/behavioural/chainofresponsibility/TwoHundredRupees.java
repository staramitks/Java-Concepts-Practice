package home.amit.designpattern.behavioural.chainofresponsibility;

public class TwoHundredRupees implements ChainDispenser {

	ChainDispenser nextChain;
	@Override
	public void nextChain(ChainDispenser chain) {
		// TODO Auto-generated method stub
		nextChain=chain;
	}

	@Override
	public int dispenseCurrencyNotes(int money) {
		int twokNotes=money/200;
		int remaining=money%200;
		nextChain.dispenseCurrencyNotes(remaining);
	    System.out.println("Two Hundred notes "+twokNotes);
	    return twokNotes;
	}

}
