package home.amit.java.basic.collections;

import java.util.ArrayList;
import java.util.List;


// Two lists are equal if order of adding elements in the list is same

public class CompareLists {
    public static void main(String[] args) {

        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();

        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);

        listTwo.add(1);
        listTwo.add(2);
        listTwo.add(3);
        listTwo.add(4);
        listTwo.add(5);


        if (listOne == listTwo) {
            System.out.println("Lists are Equal ==> listOne == listTwo ");
        }
        if (listOne.equals(listTwo)) {
            System.out.println("Lists are Equal ==> listOne.equals(listTwo)");
        } else {
            System.out.println("Lists are not equal");
        }
    }
}
