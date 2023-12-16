package week_05.nisa_solutions;


public class ReverseNumber {
    public static void main(String[] args) {

        String word = "ABCD";

        System.out.println(reverseWord(word));


    }

    public static String reverseWord(String word) {

        String reverse = "";

        for (int i = word.length()-1; i >= 0 ; i--) {

            reverse += word.charAt(i);

        }
        return reverse;
    }


}

/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */