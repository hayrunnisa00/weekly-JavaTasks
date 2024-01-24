package week_10.van_solution;

import java.util.Arrays;

public class Sort_array_desc {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 20, 1, 52, 3, 5, 9, 10};

        System.out.println(Arrays.toString(sort_array_desc(arr)));
    }

    public static int[] sort_array_desc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    //Swap
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        return arr;
    }
}
