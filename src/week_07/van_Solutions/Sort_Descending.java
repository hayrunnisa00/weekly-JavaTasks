package week_07.van_Solutions;

import java.util.Arrays;

/*
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7}
 */
public class Sort_Descending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 20, 1, 52, 3, 5, 9, 10};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }

    public static int[] sortDescending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}