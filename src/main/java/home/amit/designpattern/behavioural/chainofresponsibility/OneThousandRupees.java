package home.amit.designpattern.behavioural.chainofresponsibility;

public class OneThousandRupees implements ChainDispenser {

    ChainDispenser nextChain;

    @Override
    public void nextChain(ChainDispenser chain) {
        // TODO Auto-generated method stub
        nextChain = chain;
    }

    @Override
    public int dispenseCurrencyNotes(int money) {
        int onekNotes = money / 1000;
        int remaining = money % 1000;
        nextChain.dispenseCurrencyNotes(remaining);
        System.out.println("One K notes " + onekNotes);
        return onekNotes;
    }

}
