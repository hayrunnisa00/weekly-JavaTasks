package week_08.nisa_solutions;

import java.util.Arrays;
import java.util.Collections;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};


        System.out.println(Arrays.toString(moveZeroEnd(arr)));

    }

    private static String[] moveZeroEnd(int[] arr) {

        String zero = "";
        String number = "";

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] == 0){
                zero += arr[i];
            }else {
                number += arr[i];
            }

        }

        return (number+zero).split("");
    }
}
