package week_07.nisa_solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] arr = {1, 4, 8, 10, 3, 6};

        System.out.println("Ascending order" + ascendingOrder(arr));
        System.out.println("Descending order" + descendingOrder(arr));


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


    public static ArrayList<Integer> descendingOrder(int[] arr){

        ArrayList<Integer> descending = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {

                if (descending.contains(arr[i])){
                    continue;
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            descending.add(max);
        }
        return descending;

    }


}
