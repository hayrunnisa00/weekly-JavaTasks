package week_08.van_solution;

import java.util.Arrays;

public class ZeroToEnd {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2,2, 0, 3, 0, 4, 0};


        System.out.println(Arrays.toString(moveZeroEnd(arr)));

    }

    private static String[] moveZeroEnd(int[] arr) {

        String zero = "";
        String number = "";

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == 0) {
                zero += arr[i];
            } else {
                number += arr[i];
            }

        }

        return (number + zero).split("");
    }
}
/*
 Array - Move Zeros to the End
 Write a method that can move all the zeros to last indexes of the array (Do
 Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
 0]*/

