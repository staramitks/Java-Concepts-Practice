package home.amit.java8.enhancements.lambdas;

interface MyFunc {

    int func(int n);
}


public class LambdaExpressionVariableCapture {


    public static void main(String[] args) {


        int clsVar = 10;

        home.amit.java8.enhancements.lambdas.MyFunc myFunc = (n) -> {

            int result = n + clsVar;

            return result;
        };
        System.out.println("Result is " + myFunc.func(100));

    }
}
