package home.amit.designpattern.behavioural.chainofresponsibility;

public class OneHundredRupees implements ChainDispenser {

    ChainDispenser nextChain;

    @Override
    public void nextChain(ChainDispenser chain) {
        // TODO Auto-generated method stub
        nextChain = chain;
    }

    @Override
    public int dispenseCurrencyNotes(int money) {
        int oneHNotes = money / 100;
        int remaining = money % 100;
        //nextChain.dispenseCurrencyNotes(remaining);
        System.out.println("One Hundred notes " + oneHNotes);
        return oneHNotes;
    }

}
