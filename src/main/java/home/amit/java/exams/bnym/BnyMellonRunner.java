package home.amit.java.exams.bnym;
/*
User :- AmitSingh
Date :- 7/29/2023
Time :- 10:56 PM
Year :- 2023
*/


public class BnyMellonRunner {

    public static boolean hasOnePairAndZeroOrMoreTriplets(String input) {
        int pairCount = 0;
        int tripletCount = 0;
        int i = 0;

        while (i < input.length()) {
            char currentChar = input.charAt(i);

            // Count the occurrences of the current character
            int count = 1;
            while (i + 1 < input.length() && input.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            // Check for pairs and triplets
            if (count == 2) {
                pairCount++;
            } else if (count == 3) {
                tripletCount++;
            } else if (count > 3) {
                // If there are more than 3 occurrences of a character,
                // we have additional triplets, but we only count one triplet
                tripletCount++;
            }

            i++; // Move to the next character
        }

        return pairCount == 1 && tripletCount >= 0;
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "55555", // true
                "42",    // false
                "4242",  // false
                "22555666777898989" // true
        };

        for (String testString : testStrings) {
            boolean result = hasOnePairAndZeroOrMoreTriplets(testString);
            System.out.println(testString + " is " + result);
        }
    }
}
