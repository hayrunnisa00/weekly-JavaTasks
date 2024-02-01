package week_11.Santiago_Solutions;

import java.util.*;

public class FrequencyCharMaps {

    public static void main(String[] args) {

        String word = "EmmaLewis";

        frequencyOfChar(word);

    }

    public static void frequencyOfChar (String word) {

        Map<String, Integer> map = new LinkedHashMap<>();

        String[] split = word.split("");


        for (int i = 0; i < word.length(); i++) {

            map.put(word.charAt(i) + "", Collections.frequency(List.of(split), split[i]));
        }

        System.out.println("map = " + map);

    }
}
/*
Map-- Frequency of Characters
Write a method that prints the frequency of each character from a String.

 */