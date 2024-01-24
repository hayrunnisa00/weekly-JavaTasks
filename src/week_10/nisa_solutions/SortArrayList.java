package week_10.nisa_solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 8, 10, 34, 23, 55, 12, 4, 10, 2));

        System.out.println(sortAsc(list));
        System.out.println(sortDesc(list));

    }

    public static ArrayList<Integer> sortAsc(ArrayList<Integer> list) {

        ArrayList<Integer> ascOrder = new ArrayList<>();
        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {

                if (arr[j] > arr[j+1]){
                    int a = arr[j];
                    int b = arr[j+1];

                    arr[j]= b;
                    arr[j+1]= a;

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            ascOrder.add(arr[i]);
        }


        return ascOrder;
    }


    public static ArrayList<Integer> sortDesc(ArrayList<Integer> list) {

        ArrayList<Integer> descOrder = new ArrayList<>();

        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {

                if (arr[j] < arr[j+1]){
                    int a = arr[j];
                    int b = arr[j+1];

                    arr[j]= b;
                    arr[j+1]= a;

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            descOrder.add(arr[i]);
        }

        return descOrder;
    }


}

/*
    1. ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.


    2. ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.

 */