package home.amit.java.basic.generics.hierarchy;
/*
User :- AmitSingh
Date :- 5/9/2024
Time :- 11:30 AM
Year :- 2024
*/

public class ClassExtendsBaseClass extends ClassBase{

    public ClassExtendsBaseClass(){
        System.out.println("This is from ClassExtendsBaseClass");
    }

    @Override
    public void print()
    {
        System.out.println("This is from ClassExtendsBaseClass");
    }
}
