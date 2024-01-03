package week_07.van_Solutions;

import java.util.Arrays;

/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10}
 */
public class Sort_ascending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 20, 1, 52, 3, 5, 9, 10};
        System.out.println(Arrays.toString(sortedArr(arr)));
    }

    public static int[] sortedArr(int[] arr) {
//
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
        return arr;
    }
}