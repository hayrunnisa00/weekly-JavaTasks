package week_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZerosToEnd {

    public static void main(String[] args) {

        int[] input = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(input);

        System.out.println("==============================");

        int[] input2 = {0, 0, 0, 0, 0, 4, 0};

        moveZerosToEnd2(input2);



    }


    public static void moveZerosToEnd(int[] arr) {

        ArrayList<Integer> listArr = new ArrayList<>();//This Arraylist is going to contain the numbers that are not equal to zero

        int count = 0; // it's going  to count how many zeros are in the array

        for (int i = 0, j = 0; i < arr.length; i++, j++) { // 1 0 2 0 3 0 4 0 5

            if (arr[i] != 0) {
                listArr.add(Integer.valueOf(arr[i]));
            } else {
                count++;
            }

        }

        for (int i = 0; i < count; i++) { // Here I'm going to add all the zeros I left out
            listArr.add(0);
        }

        Integer[] arr2 = listArr.toArray(listArr.toArray(new Integer[listArr.size()]));

        System.out.println(Arrays.toString(arr2));

    }

    public static void moveZerosToEnd2(int[] arr) {

        List<Integer>list=new ArrayList<>();

        for (int each : arr) {
                list.add(each);
        }

        int frequencyOfZeros = Collections.frequency(list, 0);

        list.removeIf(k -> k == 0);

        for (int i = 0; i < frequencyOfZeros; i++) {

            list.add(0);
        }

        System.out.println(Arrays.toString(list.toArray(new Integer[list.size()])));

    }
}
/*
 Array - Move Zeros to the End

 Write a method that can move all the zeros to last indexes of the array (Do
 Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
 0]*/