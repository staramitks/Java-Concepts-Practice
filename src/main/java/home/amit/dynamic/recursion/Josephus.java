package home.amit.dynamic.recursion;

import java.util.ArrayList;
import java.util.List;

public class Josephus {

    private static void findRemainingPerson(int n, int k) {

        List<Integer> personArray = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            personArray.add(i);
        }
        getRemainingPerson(personArray, k - 1, 0);
    }

    private static void getRemainingPerson(List<Integer> personArray, int k, int startPosition) {
        if (personArray.size() == 1) {
            System.out.println(personArray.get(0));
            return;
        }
        int mod = (startPosition + k) % personArray.size();
        personArray.remove(mod);
        startPosition = mod;
        getRemainingPerson(personArray, k, startPosition);
    }


    public static void main(String[] args) {

        int n = 40;
        int k = 7;

        findRemainingPerson(n, k);
    }


}
