package week_08.nisa_solutions;

import java.util.Arrays;
import java.util.Collections;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};


        System.out.println(Arrays.toString(moveZeroEnd(arr)));
        System.out.println(Arrays.toString(moveZero(arr)));
        System.out.println(Arrays.toString(zero(arr)));


    }

    private static int[] moveZeroEnd(int[] arr) {

        int[] zeroEnd = new int[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0){
                zeroEnd[j] = arr[i];
                j++;
            }
        }
        return zeroEnd;
    }


    public static String[] moveZero(int[] arr){

        String num = "";
        String zero = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                zero += arr[i];
            }else {
                num += arr[i];
            }
        }
        return (num + zero).split("");
    }


    public static int[] zero(int[] arr){
        Arrays.sort(arr);
        int[] sorted = new int[arr.length];
        for (int i = arr.length-1, j=0; i >= 0; i--, j++) {
            sorted[j] = arr[i];
        }
        return sorted;
    }


}
