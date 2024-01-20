package week_04.lokman_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Same_Letters {
    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("abc","abb"));
    }
    public static boolean sameLetters(String input1,String input2){

        List<String> in1 = new ArrayList<>(Arrays.asList(input1.split("")));
        Collections.sort(in1);

        List<String>in2 = new ArrayList<>(Arrays.asList(input2.split("")));
        Collections.sort(in2);

        boolean same=false;

        if (in1.equals(in2)) {
            same = true;
        }else{
            same = false;
        }
return same;
    }
}
/*String -- Same letters
        Write a return method that check if a string is build out of the
        same letters as another string.
        Ex: same("abc", "cab"); -> true
        same("abc", "abb"); -> false:CCC") ==> ABC*/