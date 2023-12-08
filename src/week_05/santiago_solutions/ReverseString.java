package week_05.santiago_solutions;

import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        //TC1
        //Ex: Reverse("ABCD"); ==> DCBA
        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));

    }

   /* public static String reverseString2(String str) {
        List<String> arrayListString = new ArrayList<>(Arrays.asList(str.split("")));

        Deque<String> stackString = new LinkedList<>();
        stackString.addAll(arrayListString);

        (Stack<String>)arrayListString.poll();



    }*/
    public static String reverseString(String str) {


        String reverseResult = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverseResult += str.charAt(i);
        }

        return reverseResult;

    }

}
//String -- Reverse
//Write a return method that can reverse String
//Ex: Reverse("ABCD"); ==> DCBA