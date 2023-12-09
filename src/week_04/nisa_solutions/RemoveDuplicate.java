package week_04.nisa_solutions;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "AAABBCCCDDDD";

        System.out.println(removeDup(str));


    }

    private static String removeDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains(str.charAt(i) + "")) {
                continue;
            } else {

                result += str.charAt(i);
            }
        }
        return result;
    }

}