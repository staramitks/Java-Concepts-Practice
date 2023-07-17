package home.amit.java.practice;
/*
User :- AmitSingh
Date :- 7/17/2023
Time :- 8:43 PM
Year :- 2023
*/


// Assumption - num has elements greater than zero
// target is greater than zero
// if no data then return -1 and -1

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private int[] getArrayIndex(int[] num, int target) {
        int[] indexArray = new int[2];
        boolean result = false;
        for (int i = 0; i < num.length; i++) {
            for (int k = i + 1; k < num.length; k++) {
                if (num[i] + num[k] == target) {
                    indexArray[0] = i;
                    indexArray[1] = k;
                    result = true;
                    break;
                }

            }
        }

        if (!result)
        {
            indexArray[0] = -1;
            indexArray[1] = -1;
        }
        return indexArray;
    }


    private int[] getArrayIndexUsingMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
    int[] num={10,20,30,40,50,1,34,89,232,90};
    int target=411;
    TwoSum twoSum= new TwoSum();
    int[] result=twoSum.getArrayIndex(num,target);
    System.out.println(Arrays.toString(result));

    int[] result2=twoSum.getArrayIndexUsingMap(num,target);
    System.out.println(Arrays.toString(result2));

    }


}
