package week_07.firyuza;

import java.util.ArrayList;

public class Arrays_Sort_Descending {

    public static void main(String[] args) {

        int[] arr = {1, 4, 8, 10, 3, 6};

        System.out.println(ascendingOrder(arr));


    }

    public static ArrayList<Integer> ascendingOrder(int[] arr){

        ArrayList<Integer> ascending = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {

                if (ascending.contains(arr[i])){
                    continue;
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            ascending.add(max);

        }



        return ascending;


    }
}
