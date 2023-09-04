package home.amit.designpattern.behavioural.chainofresponsibility;

public class TwoThousandRupees implements ChainDispenser {


    ChainDispenser nextChain;

    public void nextChain(ChainDispenser chain) {
        // TODO Auto-generated method stub
        this.nextChain = chain;
    }

    public int dispenseCurrencyNotes(int money) {

        int twokNotes = money / 2000;
        int remaining = money % 2000;
        nextChain.dispenseCurrencyNotes(remaining);
        System.out.println("Two K notes " + twokNotes);
        return twokNotes;
    }

}
