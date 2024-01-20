package week_10.Santiago_Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList_sortDescending {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,10,9,2,3,5,1));

        arraySortDesc1(list);

    }


    private static void arraySortDesc1(ArrayList<Integer> arrayList) {

        ArrayList<Integer> arrayListSorted = new ArrayList<>();

        for (Integer each : arrayList) { // 2,3,1,2,4,5,10,7

            for (Integer each2 : arrayList) {//2 , 3

                if (each2 >= each) {

                    if (!arrayListSorted.contains(each2)) {
                        arrayListSorted.add(each2);
                    }

                }

            }

        }

        System.out.println(arrayListSorted);
    }
}

/*ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.*/
