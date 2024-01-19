package week_05.Jonny_Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class findTheUnique {
    public static void main(String[] args) {
        System.out.println(UniqueLetter("AAABBBCCCDEF"));
        }
        public static String UniqueLetter(String str) {
            String result = "";
            ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
            for (int i = 0; i < list.size(); i++) {
                int count = Collections.frequency(list, list.get(i));
                if (count == 1) {
                    result += list.get(i);
                }
            }
            return result;


        }
    }















  /*  Write a return method that can find the unique characters from the String
        Ex: unique("AAABBBCCCDEF") ==> "DEF";*/