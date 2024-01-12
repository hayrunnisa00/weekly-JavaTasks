package week_09.Santiago_Solutions;

import java.util.Arrays;

public class Array_Concat_two_arrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] arr3 = concatTwoArrays1(arr1, arr2);

        System.out.println(Arrays.toString(arr3));
    }


    public static int[] concatTwoArrays1(int[] arr1,int[] arr2) {

        int[] arr3=new int[arr1.length + arr2.length];

        int count = 0;

        for (int i = 0; i < arr1.length ; i++) {
            count++;
            arr3[i]+=arr1[i];

        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[count + i] = arr2[i];
        }



        return arr3;

    }

    @Override
    public static int[] concatTwoArrays1(Integer[] arr1, Integer[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        return arr3;

    }

}

/*1) Array - Concat two arrays
Write a return method that can concate two arrays*/