package home.amit.java.algorithm.dp.recursion;

public class TowerOfHanoiRecursion {

    public int solve (String source, String destination, String helper, int n)
    {
        if (n==1)
        {
           return 1;
        }


        else {
            return solve(source, helper, destination, n - 1) + solve(helper, destination, source, n - 1);
        }
    }




    public static void main(String[] args) {
        TowerOfHanoiRecursion towerOfHanoiRecursion= new TowerOfHanoiRecursion();
        int count=towerOfHanoiRecursion.solve("source","destination","helper",4);
        System.out.println(count);
    }
}
