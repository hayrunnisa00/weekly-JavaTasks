package week_06.nisa_solutions;

import java.util.Arrays;

public class FindMaxElement {
    public static void main(String[] args) {

        int[] arr = {3000, 6, 888, 12, 78, 90, 34, 27};

        System.out.println("Max Element = " + maxElement(arr));

    }

    private static int maxElement(int[] arr) {

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