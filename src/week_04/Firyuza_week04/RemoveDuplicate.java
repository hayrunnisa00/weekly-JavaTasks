package week_04.Firyuza_week04;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = "AAABBBCCC";

        System.out.println(removeDuplicate(str));

    }

   /* public static String RemoveDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("+each")) {
                result += each;
            }

            System.out.println(result);
        }
        return result;
    }*/
    public static String removeDuplicate(String string){
        // This doesn't accept duplicates and keeps the insertion order
        Set<String> removeDuplicates = new LinkedHashSet<>(Arrays.asList(string.split("")));

        String result = "";

        for (String eachElement : removeDuplicates) {
            result+=eachElement;
        }

        return result;
    }


}

/*Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> AB
 */