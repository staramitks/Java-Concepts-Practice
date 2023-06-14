package home.amit.dynamic.recursion;

import home.amit.java.basic.dataprovider.DataProvider;

import java.util.List;

public class SortArrayListRecursion {


    public static void main(String[] args) {
        List<Integer> list = DataProvider.getIntList();
        list.stream().forEach(e -> System.out.println(e));
        SortArrayListRecursion sortArrayListRecursion = new SortArrayListRecursion();
        sortArrayListRecursion.sort(list);
        System.out.println("After Sorting");
        list.stream().forEach(e -> System.out.println(e));

    }

    private void sort(List<Integer> list) {
        if (list == null || list.size() == 1) {
            return;
        }
        int lastElem = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        sort(list);
        insert(list, lastElem);
    }

    private void insert(List<Integer> list, int lastElem) {
        if (list.size() == 0 || list.get(list.size() - 1) <= lastElem) {
            list.add(lastElem);
            return;
        }
        int newLastElem = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        insert(list, lastElem);
        list.add(newLastElem);
        return;


    }
}
