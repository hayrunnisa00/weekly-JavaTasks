package week_05.nisa_solutions;

import week_04.nisa_solutions.FrequencyCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        System.out.println(uniqueChar(str));
        System.out.println(uniqueChar2(str));



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


    public static String uniqueChar2(String str){

        String uniq = "";
        String word = FrequencyCharacters.frequencyCharacter(str);

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == '1'){

                uniq += word.substring(i-1, i);

            }

        }
        return uniq;
    }



}

/*
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */