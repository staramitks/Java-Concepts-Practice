package home.amit.java.exams.bnym;
/*
User :- AmitSingh
Date :- 9/9/2023
Time :- 6:31 AM
Year :- 2023
*/

import java.util.*;

public class TotalDistanceArrayElements {

    private static int[] getMinDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            int cur = nums[i];
            int sum = 0;
            if(map.containsKey(cur)) {
                for(int c : map.get(cur)) {
                    res[c] += i - c;
                    sum += i - c;
                }
            }
            res[i] += sum;
            map.putIfAbsent(cur, new ArrayList<>());
            map.get(cur).add(i);
        }
        return res;
    }


    public static void main(String[] args) {

        int[] nums = {1,3,1,1,2};
        System.out.println(Arrays.toString(getMinDistance(nums)));

    }
}
