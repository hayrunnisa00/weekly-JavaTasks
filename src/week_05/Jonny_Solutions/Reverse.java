package week_05.Jonny_Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }}










/*Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA*/