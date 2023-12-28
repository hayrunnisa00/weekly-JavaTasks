package week_07.santiago_solutions;

import java.util.*;

//Question1: Array - Find Minimum
//Write a method that can find the minimum number from an int Array
public class MinArray {


    public static void main(String[] args) {

        int[] arr = {1000, 3000, 4, 500, 6, 7, 8, 9, 400}; // Example
        System.out.println("minNumberArr1(arr) = " + minNumberArr1(arr));
        System.out.println("minNumberArr2(arr) = " + minNumberArr2(arr));
        System.out.println("=====================================");

        int[] arr2 = {-2, -900, 400, 3, 5, 7, 8,};
        System.out.println("minNumberArr1(arr2) = " + minNumberArr1(arr2));
        System.out.println("minNumberArr2(arr2) = " + minNumberArr2(arr2));
    }


//Write a method that can find the maximum number from an int Array
    public static int minNumberArr1(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;

    }

    public static int minNumberArr2(int[] arr) {

        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arrList.add(Integer.valueOf(arr[i]));
        }

        return Collections.min(arrList);

    }



}

