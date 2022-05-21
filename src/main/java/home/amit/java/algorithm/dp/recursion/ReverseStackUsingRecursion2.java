package home.amit.java.algorithm.dp.recursion;

import java.util.Stack;

public class ReverseStackUsingRecursion2 {
    // 1
    // 2
    public  void reverseStack(Stack<Integer> stack)
    {
        if (stack.size()==0)
        {
            return;
        }
        int temp=stack.pop();
        reverseStack(stack);
        insertStack(stack, temp);

   }

    private void insertStack(Stack<Integer> stack, int temp) {
        if (stack.size()==0) {
            stack.push(temp);
            return;
        }
        int temp2=stack.pop();
        insertStack(stack,temp);
        stack.push(temp2);

    }


    public static void main(String[] args) {
        ReverseStackUsingRecursion2 reverseStackUsingRecursion= new ReverseStackUsingRecursion2();
        Stack<Integer> stack= new Stack<>();
        Stack<Integer> reveredStack= new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        System.out.println("Before");
        for (Integer integer : stack) {
            System.out.println(integer);
        }
        reverseStackUsingRecursion.reverseStack(stack);

        System.out.println("After");
        for (Integer integer : stack) {
            System.out.println(integer);
        }
     }
}
