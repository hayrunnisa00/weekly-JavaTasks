package week_05.nisa_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        System.out.println(uniqueChar(str));

    }

    public static String uniqueChar (String str) {

        String result = "";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (String each : list) {

                int freq = Collections.frequency(list, each);

                if (freq == 1){
                    result += each;
                }
        }
        return result;

    }

}

/*
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */