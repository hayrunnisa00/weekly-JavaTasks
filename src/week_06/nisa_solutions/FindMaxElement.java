package week_06.nisa_solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxElement {
    public static void main(String[] args) {

        int[] arr = {3000, 6, 888, 12, 78, 90, 34, 27};

        System.out.println("Max Element Method1 = " + maxElement1(arr));
        System.out.println("Max Element Method2 = " + maxElement2(arr));

    }

    public static int maxElement1(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    public static int maxElement2(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }



}

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */