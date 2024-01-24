package week_10.Santiago_Solutions;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class arrayList_sortAscending {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 20, 1, 52, 3, 5, 9, 10,5,5));


        System.out.println(arraySortAsc3(list));

        arraySortAsc1(list);

        //arraySortAsc2(list);




    }



    //Using TreeSet Collection DataStructure -- it only  works with unique value doesn't accept duplicates
    private static void arraySortAsc1(ArrayList<Integer> arrayList) {

        Set<Integer> setlist = new TreeSet<>(arrayList); // create a TreeSet collection

        arrayList.clear();// we clear the all arrayList to reuse it

        arrayList.addAll(setlist);// we add the TreeSet collection to the empty arrayList

        System.out.println(arrayList); // We just print it to see the result

    }

    //ArrayList and forEach loop -> contains methods and if condition-- Doesn't allow duplicates values
    private static void arraySortAsc2(ArrayList<Integer> arrayList) {

        ArrayList<Integer> arrayListSorted = new ArrayList<>();

        for (Integer each : arrayList) { // 2,3,1,2,4,5,10,7

            for (Integer each2 : arrayList) {//2 , 3

                if (each2 <= each) {

                    if (!arrayListSorted.contains(each2)) {
                        arrayListSorted.add(each2);

                    }

                }

            }

        }

        System.out.println(arrayListSorted);
    }


    // Two for loops and allows duplicates, Best answer to this problem
    public static ArrayList<Integer> arraySortAsc3(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < list.size() -1; j++) {
                if (list.get(j) > list.get(j + 1)) {
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

}




/*ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.*/

