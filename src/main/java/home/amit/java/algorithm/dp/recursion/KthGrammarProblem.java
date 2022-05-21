package home.amit.java.algorithm.dp.recursion;

// 0
// 0 1
// 0 1 1 0
// 0 1 1 0 1 0 0 1
public class KthGrammarProblem {

    public int getKthGrammar(int n, int k)
    {
        if (n==1 )
        {
            return 0;
        }
        int mid=Integer.valueOf(String.valueOf(Math.round(Math.pow(2,n-1))))/2;

        if (k<=mid)
        {
            return getKthGrammar(n-1,k);
        }
        else
        {
            return 1-getKthGrammar(n-1,k);

        }
    }

    public static void main(String[] args) {
        int n=4;
        int k=0;
        KthGrammarProblem kthGrammarProblem= new KthGrammarProblem();
        System.out.println(kthGrammarProblem.getKthGrammar(n,k));
    }
}
