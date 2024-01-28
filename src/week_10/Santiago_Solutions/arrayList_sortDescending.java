package week_10.Santiago_Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class arrayList_sortDescending {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,10,9,2,3,5,1));

        System.out.println(mergeAndSortDescending1(list));

         mergeAndSortDescending2(list);

    }

    //Best solution - accepts duplicates --> Return method and using 2 forLoops , swapping numbers with temp variable
    private static ArrayList<Integer> mergeAndSortDescending1(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < list.size() -1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    // Swap arr[j] and arr[j + 1]
                    Integer temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j+1, temp);
                    //arr[j + 1] = temp;
                }
            }
        }

        return list;
    }

    //TreeSet and then reverse Loop to add the values to an empty list. Simple but doesn't allow duplicates
    private static void mergeAndSortDescending2(ArrayList<Integer> list) {

        Set<Integer> setList = new TreeSet<>(list);
        list.clear();

        for (int i = setList.size()-1; i >= 0; i--) {

            list.add((new ArrayList<Integer>(setList).get(i)));

        }

        System.out.println(list);
    }
}

/*ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.*/
