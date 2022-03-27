package home.amit.java.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public BinarySearch(){}

    public static void main(String[] args) {
        List<Integer> intList= new ArrayList<>();
        intList.add(40);
        intList.add(50);
        intList.add(60);
        intList.add(70);
        intList.add(10);
        intList.add(20);
        intList.add(30);

        intList.sort(Integer::compareTo);

        System.out.println(intList);
        BinarySearch binarySearch= new BinarySearch();
        System.out.println(binarySearch.findElementUsingBinarySearch(intList,30));


    }


    public boolean findElementUsingBinarySearch(List<Integer> list, int element)
    {
        boolean result=false;
        int start=0;
        int end=list.size()-1;
        int counter=1;
        while(start<end)
        {
            System.out.println("Iterating "+counter);
            int mid=(end+start)/2;
            if (element==list.get(mid))
            {
                result=true;
                break;
            }
            else if(element<list.get(mid))
            {
                end=mid;
            }
            else if(element>list.get(mid))
            {
                start=mid;
            }
            counter++;

        }
        return result;

    }



}
