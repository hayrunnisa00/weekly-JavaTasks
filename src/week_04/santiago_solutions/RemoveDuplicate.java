package week_04.santiago_solutions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "AAABBBCCC";

        System.out.println(removeDuplicates(str));

    }

    public static String removeDuplicates(String string) {

        // This doesn't accept duplicates and keeps the insertion order
        Set<String> removeDuplicates = new LinkedHashSet<>(Arrays.asList(string.split("")));

        String result = "";

        for (String eachElement : removeDuplicates) {
            result+=eachElement;
        }

        return result;

    }


   /* public static String removeDuplicate(String str){

        String result= ""; //Declaring an empty string where we are going to add the unique characters

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // A A A B B C C C

             if (result.contains(""+ch)) { // if the character is already in the result skip the adding part
                 continue;

             }else { // it will just add unique characters

                 result += "" + ch;

             }

        }

        return result; // I will return the result with the unique Ch*/
    }

/*
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */