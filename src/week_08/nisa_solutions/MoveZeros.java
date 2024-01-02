package week_08.nisa_solutions;

import java.util.Arrays;
import java.util.Collections;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};


        System.out.println(Arrays.toString(moveZeroEnd(arr)));

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
}
