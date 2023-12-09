package week_05.santiago_solutions;

import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        //TC1
        //Ex: Reverse("ABCD"); ==> DCBA
        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));

        reverseString2("ABCD");

    }

    public static String reverseString(String str) {

        String reverseResult = "";

        for (int i = str.length()-1; i >= 0; i--) { // Reverse Loop
            reverseResult += str.charAt(i);
        }

        return reverseResult;

    }

   public static void reverseString2(String str) {

        List<String> arrayListString = new ArrayList<>(Arrays.asList(str.split("")));

        Stack<String> stackString = new Stack<>();

        for (String each : arrayListString) {
            stackString.push(each); // A B C D
        }

        List<String> reverseString = new ArrayList<>();

        //size of reverseString :4 coz -->stackString.size()//4
        reverseString.add(stackString.pop());// D
        reverseString.add(stackString.pop());//C
        reverseString.add(stackString.pop());//B
        reverseString.add(stackString.pop());//A


        System.out.println(reverseString);

    }


}
//String -- Reverse
//Write a return method that can reverse String
//Ex: Reverse("ABCD"); ==> DCBA