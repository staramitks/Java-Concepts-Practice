package home.amit.java.algorithm.leetcode;

import home.amit.java.basic.dataprovider.DataProvider;

import java.util.List;

public class RecursionSumList {

    public int sum(List<Integer> list)
    {
        if (list.size()==1)
        {
            return list.get(0);
        }
        else
        {
            return list.get(0)+sum(list.subList(1,list.size()-1));
        }

    }


    public static void main(String[] args) {

        RecursionSumList sumObj=new RecursionSumList();

        System.out.println(sumObj.sum(DataProvider.getIntList()));

    }

}
