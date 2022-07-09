package home.amit.dynamic.recursion;

public class PrintNumbers {


    public void printNum(int n){

        if (n==0)
        {
            return ;
        }
        else {
            int num=n;
            System.out.println(n);
            printNum(n-1);

        }

    }


    public void printNumIncreasing(int n){

        if (n==1)
        {
            System.out.println(n);
            return ;
        }
        else {

            printNumIncreasing(n-1);
            System.out.println(n);

        }

    }

    public static void main(String[] args) {

        PrintNumbers printNumbers= new PrintNumbers();
        printNumbers.printNum(10);
        System.out.println("=======================");
        printNumbers.printNumIncreasing(10);


    }
}
