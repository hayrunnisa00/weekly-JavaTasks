package week_09.Santiago_Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Concat_two_arrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(concatTwoArrays1(arr1, arr2)));

        System.out.println("=======================================");


    }


    public static int[] concatTwoArrays1(int[] arr1,int[] arr2) {

        int[] arr3=new int[arr1.length + arr2.length];
                            // 5

        for (int i = 0; i < arr1.length ; i++) {

            arr3[i]=arr1[i];

        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+ i] = arr2[i];
        }           //5+0
                    //5+1=6

        return arr3;

    }


}

/*1) Array - Concat two arrays
Write a return method that can concatenate two arrays*/