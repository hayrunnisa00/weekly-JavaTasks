package week_04.santiago_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println("sameLetters(\"abc\", \"cab\") = " + sameLetters("abc", "cab"));

        System.out.println("sameLetters(\"abc\", \"abb\") = " + sameLetters("abc", "abb"));

    }


    public static boolean sameLetters(String str1, String str2) {

        List<String> string1 = new ArrayList<>(Arrays.asList(str1.split("")));

        Collections.sort(string1); // abc

        List<String> string2 = new ArrayList<>(Arrays.asList(str2.split("")));

        Collections.sort(string2); // abc

        boolean same = false;

        if (string1.equals(string2)) {
            same = true;
        } else {
            same = false;
        }

        return same;

    }

}
/*String
Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex:
same(" abc ",","cab"); --> true
same("
abc abb "); -->*/