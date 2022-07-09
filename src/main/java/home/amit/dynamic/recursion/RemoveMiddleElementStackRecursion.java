package home.amit.dynamic.recursion;

import java.util.Stack;

public class RemoveMiddleElementStackRecursion {

    private void removeMiddleElement(Stack<Integer> stack,int index) {


        if (index==1)
        {
            stack.pop();
            return;
        }

        else
        {
            int elem=stack.pop();
            removeMiddleElement(stack,--index);
            stack.addElement(elem);
            return;
        }
    }





    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(40);
        stack.push(9);
        stack.push(11);
        stack.push(77);
        stack.push(2);
        stack.push(50);

        int middleIndex= (stack.size())/2 +1 ;
        RemoveMiddleElementStackRecursion removeMiddleElementStackRecursion= new RemoveMiddleElementStackRecursion();
        System.out.println("Before");
        for (Integer integer : stack) {
            System.out.println(integer);
        }
        removeMiddleElementStackRecursion.removeMiddleElement(stack,middleIndex);
        System.out.println("After");
        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }


}
