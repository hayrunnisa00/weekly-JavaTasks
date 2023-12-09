package Week_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_Frequency_of_Characters {
    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(Frequency(input));
    }
    public static String Frequency(String word) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(word.split("")));

        int count = 0;

        String result = "";

        for (int i = 0; i < list.size(); i++) {
            if (result.contains(list.get(i))) {

            } else {
                count = Collections.frequency(list, list.get(i));
                result += list.get(i) + count;
            }
        }
        return (result);
    }}

//String -- Frequency of Characters
//Write a return method that can find the frequency of
//characters
//Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2