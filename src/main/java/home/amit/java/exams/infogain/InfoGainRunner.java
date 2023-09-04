package home.amit.java.exams.infogain;
/*
User :- AmitSingh
Date :- 7/26/2023
Time :- 11:28 AM
Year :- 2023
*/

import java.util.Arrays;
import java.util.List;

public class InfoGainRunner {

    private void printEventNumbers(List<Integer> array) {

        for (int n : array) {
            if (isPowerOfTwo(n)) {
                System.out.println(n);
            }
        }


    }

    private boolean isPowerOfTwo(int num) {

        return (num > 0 && ((num & (num - 1)) == 0));
    }


    public static void main(String[] args) {

        InfoGainRunner infoGainRunner = new InfoGainRunner();

        infoGainRunner.printEventNumbers(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));


    }

}
