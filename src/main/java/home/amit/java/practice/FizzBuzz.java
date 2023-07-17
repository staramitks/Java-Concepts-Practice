package home.amit.java.practice;
/*
User :- AmitSingh
Date :- 7/17/2023
Time :- 8:33 PM
Year :- 2023
*/

import java.util.stream.IntStream;

public class FizzBuzz {

    public void printFizzBuzzJava8()
    {

        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 15 == 0 ? "FizzBuzz" :
                        i % 3 == 0 ? "Fizz" :
                                i % 5 == 0 ? "Buzz" :
                                        String.valueOf(i))
                .forEach(System.out::println);
    }


    public void print()
    {

        for (int i=1; i<=100; i++)
        {
            if (i%15 ==0 )
            {
                System.out.println("FizzBuzz");
            }
            else if (i%3 ==0 )
            {
                System.out.println("Fizz");
            }
            else if (i%5 ==0 )
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }

        }




    }


    public static void main(String[] args) {

        FizzBuzz fizzBuzz= new FizzBuzz();
        fizzBuzz.printFizzBuzzJava8();
        fizzBuzz.print();


    }


}
