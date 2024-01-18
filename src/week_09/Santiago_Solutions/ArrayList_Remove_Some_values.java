package week_09.Santiago_Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_Remove_Some_values {


    public static void main(String[] args) {

        List<Integer> lisNums = new ArrayList<>(Arrays.asList(1, 2, 3, 400, 500, 6, 7, 800, 99, 100, 101, 4, 5, 8, 9, 10));

        removeSomeValues(lisNums, 100);

    }
    public static void removeSomeValues(List<Integer> listNum, Integer num) {

        listNum.removeIf(k -> k > num);

        System.out.println(listNum);
    }

    //Without Remove Method from ArrayList class
    public static void removeSomeValues2(List<Integer> listNum, Integer numReferenceToRemove) {

        List<Integer> newListWithout = new ArrayList<>();

        for (Integer eachNum : listNum) {
            if (eachNum <= 100) {
                newListWithout.add(eachNum);
            }
        }
        System.out.println(listNum);
    }



}
/*3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.*/

