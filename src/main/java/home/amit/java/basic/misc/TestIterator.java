package home.amit.java.basic.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> it = list.iterator();
        list.add(50);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("After adding");

        it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
