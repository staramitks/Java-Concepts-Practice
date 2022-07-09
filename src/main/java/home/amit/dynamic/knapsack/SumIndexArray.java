package home.amit.dynamic.knapsack;

import java.util.Arrays;
import java.util.HashMap;

public class SumIndexArray {
     public static int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    ret[0] = i + 1;
                    ret[1] = j + 1;
                }
            }
        }
        return ret;
    }
    public int[] twoSumMap(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index+1 ;
                result[1] = i+1;
                break;
            } else {
                map.put(target - numbers[i], i);
            }
        }
        return result;
    }



    public static void main(String[] args) {

        SumIndexArray sumIndexArray= new SumIndexArray();
        int[] result=SumIndexArray.twoSum(new int[]{10,20,30,40,50},60);
        System.out.println(Arrays.toString(result));
        int[] resultMap=sumIndexArray.twoSumMap(new int[]{100,200,30,40,50},80);
        System.out.println(Arrays.toString(resultMap));


    }
}
