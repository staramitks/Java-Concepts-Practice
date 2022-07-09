package home.amit.dynamic.recursion;

import java.util.Stack;

public class ReverseStackUsingRecursion {
    // 1
    // 2
    public  void reverseStack(Stack<Integer> stack,Stack<Integer> reveredStack)
    {
        if (stack.size()==0)
        {
            return;
        }
        int temp=stack.pop();
        reveredStack.push(temp);
        reverseStack(stack,reveredStack);

   }


    public static void main(String[] args) {
        ReverseStackUsingRecursion reverseStackUsingRecursion= new ReverseStackUsingRecursion();
        Stack<Integer> stack= new Stack<>();
        Stack<Integer> reveredStack= new Stack<>();

        stack.push(10);
        stack.push(40);
        stack.push(9);
        stack.push(11);
        stack.push(77);
        stack.push(2);
        stack.push(50);

        System.out.println("Before");
        for (Integer integer : stack) {
            System.out.println(integer);
        }
        reverseStackUsingRecursion.reverseStack(stack,reveredStack);

        System.out.println("After");
        for (Integer integer : reveredStack) {
            System.out.println(integer);
        }
     }
}
