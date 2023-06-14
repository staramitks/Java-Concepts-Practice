package home.amit.java.basic.strings;

import java.util.Stack;

public class PolishNotation {


    public static void main(String[] args) {

        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        PolishNotation polishNotation = new PolishNotation();

        System.out.println(polishNotation.eval(tokens));

    }

    private String eval(String[] tokens) {

        String operators = "+-*/";
        Stack<String> stack = new Stack<>();
        for (String s : tokens) {
            if (!operators.contains(s)) {
                stack.push(s);

            } else {
                double a = Double.valueOf(stack.pop());
                double b = Double.valueOf(stack.pop());
                double d;
                switch (s) {

                    case "+":
                        d = a + b;
                        stack.push(String.valueOf(d));
                        break;
                    case "-":
                        d = b - a;
                        stack.push(String.valueOf(d));
                        break;
                    case "*":
                        d = a * b;
                        stack.push(String.valueOf(d));
                        break;
                    case "/":
                        d = b / a;
                        stack.push(String.valueOf(d));
                        break;

                }


            }


        }


        return stack.pop();


    }
}
