package week_07.firyuza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Array_Sort_Ascending {

    public static void main(String[] args) {

        int[] arr = {1, 4, 8, 10, 3, 6};

        System.out.println(ascendingOrder(arr));

    }

    public static ArrayList<Integer> ascendingOrder(int[] arr){

        ArrayList<Integer> ascending = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {

                if (ascending.contains(arr[i])){
                    continue;
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            ascending.add(min);

        }

        return ascending;

    }
}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */



