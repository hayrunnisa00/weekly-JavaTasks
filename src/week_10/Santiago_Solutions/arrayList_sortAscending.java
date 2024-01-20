package week_10.Santiago_Solutions;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class arrayList_sortAscending {


    public static void main(String[] args) {

        ArrayList<Integer> arrList1 = new ArrayList<>(Arrays.asList(2,2,1,10, 1, 20, 30, 2, 3, 4, 5, 50, 40));

        int frequency = Collections.frequency(arrList1, 2);
        System.out.println(frequency);


        arraySortAsc(arrList1);


        arraySortAsc2(arrList1);

        arraySortAsc3(arrList1);


    }


    private static void arraySortAsc(ArrayList<Integer> arrayList) {

        Set<Integer> setlist =new TreeSet<>(); // create a TreeSet collection
        setlist.addAll(arrayList);// add all the arraylist to this TreeSet, it will sort it out by default

        arrayList.clear();// we clear the all arrayList to reuse it
        arrayList.addAll(setlist);// we add the TreeSet collection to the empty arrayList

        System.out.println(arrayList); // We just print it to see the result

    }

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


   private static void arraySortAsc3(ArrayList<Integer>list) {

        ArrayList<Integer> listSorted = new ArrayList<>();

       int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) { //2,2,1,10, 1, 20, 30, 2, 3, 4, 5, 50, 40

            for (int j = 0; j < list.size(); j++) {// 2,2,1,10, 1, 20, 30, 2, 3, 4, 5, 50, 40

                if (list.get(j)< minValue ) {

                    minValue = list.get(j);

                    }
                }
            listSorted.add(minValue);

            }

        System.out.println(listSorted);
        }

    }




/*ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.*/

