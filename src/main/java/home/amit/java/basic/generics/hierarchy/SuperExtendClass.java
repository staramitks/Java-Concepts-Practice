package home.amit.java.basic.generics.hierarchy;
/*
User :- AmitSingh
Date :- 5/9/2024
Time :- 11:30 AM
Year :- 2024
*/

public class SuperExtendClass extends ClassExtendsBaseClass{

    @Override
    public void print()
    {
        System.out.println("This is from SuperExtendClass");
    }

    public static void main (String[] args) {
        SuperExtendClass superExtendClass= new SuperExtendClass();
        superExtendClass.print();
    }
}
