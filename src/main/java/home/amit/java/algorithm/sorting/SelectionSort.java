package home.amit.java.algorithm.sorting;

import home.amit.java.basic.dataprovider.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {


    public List<Integer> getElements() {

        List<Integer> list = DataProvider.getIntList();
        list.stream().forEach(i -> System.out.println(i));
        return list;
    }

    public void sort() {

        List<Integer> list = getElements();
        List<Integer> sortedList = new ArrayList<>();
        int size = list.size();
        //10, 20, 30,4,8,50
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(0);
            int minIndex = -1;
            for (int j = 0; j < list.size(); j++) {
                if (min >= list.get(j)) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            list.remove(minIndex);
            sortedList.add(min);
            i = 0;

        }
        System.out.println("Sorted List ===>");
        sortedList.stream().forEach(i -> System.out.println(i));
    }


    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.getElements();
        selectionSort.sort();

    }
}
