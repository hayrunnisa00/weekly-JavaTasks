package week_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class MaxNumArray {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 50, 100, 400};

        System.out.println("maxNum(array) = " + maxNum(array));

        System.out.println("==========================");

        System.out.println("maxNum2(array) = " + maxNum2(array));

        System.out.println("==========================");

        System.out.println("maxNum3(array) = " + maxNum3(array));

    }

    public static int maxNum(int[] array) {

        int max = Integer.MIN_VALUE;

        for (int each : array) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static int maxNum2(int[] arr) {

        Integer[] arrInteger = new Integer[arr.length];

        for (int i = 0; i < arrInteger.length; i++) {

            arrInteger[i] = Integer.valueOf(arr[i]);

        }

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arrInteger));

        return Collections.max(arrayList);

    }


    public static int maxNum3(int[] arr) {


        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {

            treeSet.add(Integer.valueOf(arr[i]));

        }

        ArrayList<Integer> arrayList = new ArrayList<>(treeSet);


        return arrayList.get(arrayList.size()-1);

    }
}
