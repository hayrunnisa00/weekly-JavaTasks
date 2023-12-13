package week_05.santiago_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindUniqueCharacters {

    public static void main(String[] args) {

        //TC1
        //Ex: unique("AAABBBCCCDEF") ==> "DEF";

        String uniqueCh = uniqueCharacters("AAABBBCCCDEF");

        System.out.println(uniqueCh);

    }


    public static String uniqueCharacters(String str) {

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        String result = "";
        int count = 0;

        for (int i = 0; i < list.size(); i++) {

                if (list.get(i).equals(list.get(i))) {
                    count = Collections.frequency(list, list.get(i));
                }

            if (count == 1) {
                result += list.get(i);
            }
        }

        return result;


    }


}
//String -- Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";