package home.amit.java.basic.generics.hierarchy;
/*
User :- AmitSingh
Date :- 5/9/2024
Time :- 11:29 AM
Year :- 2024
*/

public abstract class ClassBase {

    public ClassBase(){
        System.out.println("This is from ClassBase");
        System.out.println("From ClassBase - Class Name is "+this.getClass().getSimpleName());
    }

    public  void print(){
        System.out.println("Hello ClassBase");
        System.out.println("Class Name is "+this.getClass().getName());
    }
}
