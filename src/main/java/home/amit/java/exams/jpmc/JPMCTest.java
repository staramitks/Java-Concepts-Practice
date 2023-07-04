package home.amit.java.exams.jpmc;

import java.util.Arrays;
import java.util.List;

public class JPMCTest {
    public static void main(String[] args) {
        String testString = "START-10:120-30:40-50:10-40:50-120:30-END";
        List<String> list = Arrays.asList(testString.split(":"));
        int matchCount = 0;

        for (int start = 0; start < list.size() - 1; start++) {
            for (int j = start + 1; j < list.size(); j++) {
                if (list.get(start).split("-")[1].equalsIgnoreCase(list.get(j).split("-")[0])) {
                    matchCount++;
                    if (start + 1 != j) {
                        String jval = list.get(j); //10-40
                        String ival = list.get(start + 1); //120-30
                        list.set(start + 1, jval); //START-10:10-40
                        list.set(j, ival);   //START-10:10-40...120-30
                    }
                }
            }
        }

        if (matchCount == list.size() - 1) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }


    }
}
