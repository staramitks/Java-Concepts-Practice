package home.amit.designpattern.behavioural.chainofresponsibility;

public class CurrencyDispenserRunner {
	
	public static void main (String... args)
	{
		
		ChainDispenser twoKchain=new TwoThousandRupees();
		ChainDispenser oneKchain=new OneThousandRupees();
		ChainDispenser fiveHchain=new FiveHundredRupees();
		ChainDispenser twoHchain=new TwoHundredRupees();
		ChainDispenser oneHchain=new OneHundredRupees();
		twoKchain.nextChain(oneKchain);
		oneKchain.nextChain(fiveHchain);
		fiveHchain.nextChain(twoHchain);
		twoHchain.nextChain(oneHchain);
		
		twoKchain.dispenseCurrencyNotes(122300);
	}

}
