package week_07.van_Solutions;

import java.util.Arrays;

/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */
public class Find_minimum {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 20,1,52,3,5,9,10};
        System.out.println(minimumArray(arr));
        System.out.println(minimumArray1(arr));
        System.out.println(minimumArray2(arr));
        System.out.println(minimumArray3(arr));
    }
    public static int minimumArray(int [] arr){
        //get the max int
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }

    public static int minimumArray1(int [] arr) {
      return   Arrays.stream(arr).min().getAsInt();

    }
    public static int minimumArray2(int [] arr) {
        //get the first element of array
        int min = arr[0];
        for (int i = 1; i < arr.length-1; i=i+2) {
            //arr more than 1 element
            if (i+1>arr.length){
                if (arr[i] < min) {
                    min= arr[i];
                }
            }
            if (arr[i]>arr[i+1]) {
                if (arr[i+1]<min) {
                    min=arr[i+1];
                }
            }
            if (arr[i]<arr[i+1]){
                if (arr[i]<min) {
                    min=arr[i];
                }
            }
        }
        return min;
    }
    public static int minimumArray3(int [] arr) {
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
        return arr[0];
    }


}
