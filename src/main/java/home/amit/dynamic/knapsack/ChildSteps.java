package home.amit.dynamic.knapsack;

public class ChildSteps {


    private int getStepsCount(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        return getStepsCount(n - 1) + getStepsCount(n - 2) + getStepsCount(n - 3);


    }

    public static void main(String[] args) {

        ChildSteps lChildSteps = new ChildSteps();
        int count = lChildSteps.getStepsCount(3);
        System.out.println("Count is " + count);


    }
}
