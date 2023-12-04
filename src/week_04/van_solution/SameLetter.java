package week_04.van_solution;

import java.util.Arrays;

/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
public class SameLetter {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        String str3 = "abb";
        String str4 = "abcb";

       System.out.println(sameLetter(str1, str2));
        System.out.println(sameLetter(str1, str3));
        System.out.println(sameLetter(str1, str4));

    }

    public static boolean sameLetter(String str1, String str2) {


        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        if (arr1.length != arr2.length) {
            return false;
        } else {

           if (Arrays.equals(arr1, arr2)){
               return true;
           }else {
               return false;
           }
        }

    }
}








