package home.amit.java8.enhancements.defaultexamples;


/*

In case of conflict between parent interfaces override the method in the implementing class and use
ParentClass.super.function();

 */
public class FinalForth implements Second, Third {

    public static void main(String[] Args) {

        FinalForth lFinalForth = new FinalForth();
        lFinalForth.hello();

    }

    @Override
    public void hello() {

        System.out.println("Hello from FinalForth");
        Third.super.hello();
    }

}

