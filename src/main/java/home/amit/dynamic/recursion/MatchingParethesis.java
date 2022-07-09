package home.amit.dynamic.recursion;

import java.util.ArrayList;
import java.util.List;

public class MatchingParethesis {

    public static void main(String[] args) {
        int n=3;
         printMatchingParenthesis(n);
    }

    private static void printMatchingParenthesis(int n) {
        int open=n;
        int close=n;
        var list= new ArrayList<>();
        String output="";
        getPrenthesisListStrings(open,close,output,list);
      //  list.forEach(s-> System.out.println(s));
    }

    private static void getPrenthesisListStrings(int open, int close, String output, ArrayList<Object> list) {
     if (open==0 && close==0)
     {
         list.add(output);
         System.out.println(output);
         return;
     }

     if (open>0)
     {
         String op=output+"(";
         getPrenthesisListStrings(open-1,close,op,list);

     }
    if (close>open && close>0)
    {
        String op2=output+")";
        getPrenthesisListStrings(open,close-1,op2,list);

    }

    }
}
