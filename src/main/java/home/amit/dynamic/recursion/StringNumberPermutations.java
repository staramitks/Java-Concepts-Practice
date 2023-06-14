package home.amit.dynamic.recursion;

public class StringNumberPermutations {

    //112abC
    public void alphaNumericPermutations(String input, String output) {

        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        int i = 0;
        while (Character.isDigit(input.charAt(i))) {
            output = output + input.charAt(i);
            i++;
        }
        input = input.substring(i);
        String op1 = output + input.charAt(0);
        String op2 = output + input.substring(0, 1).toUpperCase();
        input = input.length() > 1 ? input.substring(1) : "";
        alphaNumericPermutations(input, op1);
        alphaNumericPermutations(input, op2);
    }

    public static void main(String[] args) {
        String input = "3a11b22c";
        StringNumberPermutations stringCapitlizePermutations = new StringNumberPermutations();
        stringCapitlizePermutations.alphaNumericPermutations(input, "");
    }
}
