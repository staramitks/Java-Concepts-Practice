package home.amit.java.algorithm.sorting;

import home.amit.java.basic.dataprovider.DataProvider;


import java.util.List;

import static java.util.Collections.swap;

public class BubbleSort {

    public List<Integer> bubbleSort(List<Integer>  inputList)
    {
        for (int i=0;i<inputList.size();i++)
        {
            for (int j=i+1;j<inputList.size();j++)
            {
                if (inputList.get(i)>inputList.get(j))
                {
                    swap(inputList, i, j);
                 }
            }
        }
        return inputList;
    }

    public List<Integer> bubbleSort2(List<Integer>  inputList)
    {
        for (int i=0;i<inputList.size();i++)
        {
            for (int j=0;j<inputList.size()-1;j++)
            {
                if (inputList.get(j)>inputList.get(j+1))
                {
                    swap(inputList, j, j+1);
                }
            }
        }
        return inputList;
    }



    public static void main(String[] args) {

        BubbleSort bubbleSort= new BubbleSort();
        List<Integer> intList= DataProvider.getIntList();
        System.out.println(intList);
        bubbleSort.bubbleSort(intList);
        System.out.println(intList);

        List<Integer> intList2= DataProvider.getIntList();
        bubbleSort.bubbleSort2(intList2);
        System.out.println(intList2);

    }
}
