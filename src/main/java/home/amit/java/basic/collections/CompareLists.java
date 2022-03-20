package home.amit.java.basic.collections;

import java.util.ArrayList;
import java.util.List;

public class CompareLists {
    public static void main(String[] args) {

        List<Integer> listOne=new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);


        List<Integer> listTwo=new ArrayList<>();

        listTwo.add(2);
        listTwo.add(4);
        listTwo.add(5);
        listTwo.add(1);
        listTwo.add(3);


        if(listOne.equals(listTwo))
        {
            System.out.println("Lists are Equal");
        }
        else
        {
            System.out.println("Lists are not equal");
        }
    }
}
