package week_04.lokman_solutions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicates {
    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(removeDuplicates(input));
    }
    public static String removeDuplicates(String input){
        Set<String>removeDuplicates = new LinkedHashSet<>(Arrays.asList(input.split("")));

   String result="";

        for (String eachElement:removeDuplicates) {
            result+=eachElement;
        }
            return result;
        }
}



//String -- Same letters
//Write a return method that check if a string is build out of the
//same letters as another string.
//Ex: same("abc", "cab"); -> true
//same("abc", "abb"); -> false: