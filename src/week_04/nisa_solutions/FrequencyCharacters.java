package week_04.nisa_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyCharacters {
    public static void main(String[] args) {

        String str = "AAABBCDD";

        System.out.println(frequencyCharacter(str));

    }

    private static String frequencyCharacter(String str) {

        String result = "";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (String each : list) {
            if (result.contains(each)){
                continue;
            }else {
                int freq = Collections.frequency(list, each);
                result += each + freq;
            }


        }
        return result;

    }
}
