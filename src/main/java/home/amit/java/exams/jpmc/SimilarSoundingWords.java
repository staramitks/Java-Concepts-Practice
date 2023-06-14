package home.amit.java.exams.jpmc;

import java.util.Arrays;
import java.util.List;

public class SimilarSoundingWords {

    public String getPattern(String input) {
        char[] inputArray = input.toCharArray();
        StringBuilder pattern = new StringBuilder();
        int[] num = new int[inputArray.length];
        for (int k = 0; k < inputArray.length; k++) {
            num[k] = -1;
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (num[i] == -1) {
                num[i] = i;
            } else {
                continue;
            }
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    num[j] = i;
                }
            }
        }

        StringBuilder patternType = new StringBuilder();
        for (int m = 0; m < num.length; m++) {
            patternType.append(num[m]);
        }
        return patternType.toString();
    }


    public void printSimilarPatternWords(String input, List<String> list) {
        String patternType = this.getPattern(input);
        for (String s : list) {
            String testPattern = this.getPattern(s);
            if (testPattern.equals(patternType)) {
                System.out.println(s + " matches input pattern");
            } else {
                System.out.println(s + "does not matche input pattern");
            }

        }
    }


    public static void main(String[] args) {
        SimilarSoundingWords lSimilarSoundingWords = new SimilarSoundingWords();
        List<String> myList = Arrays.asList("NOON", "COOK", "LOOK", "SEND", "TEST", "LOLO");
        lSimilarSoundingWords.printSimilarPatternWords("MOON", myList);
    }
}
