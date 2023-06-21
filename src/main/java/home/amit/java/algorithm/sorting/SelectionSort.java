package home.amit.java.algorithm.sorting;

import home.amit.java.basic.dataprovider.DataProvider;

import java.util.ArrayList;
import java.util.List;

/*


The selection sort improves on the bubble sort by reducing the number of swaps
necessary from O(N2
) to O(N). Unfortunately, the number of comparisons remains
O(N2
). However, the selection sort can still offer a significant improvement for large
records that must be physically moved around in memory, causing the swap time to
be much more important than the comparison time

 */

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
