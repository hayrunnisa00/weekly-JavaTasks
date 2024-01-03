package week_06.santiago_solutions;

import java.util.*;

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


        Integer[] arrInteger = new Integer[arr.length]; // arrays Integer

        for (int i = 0; i < arrInteger.length; i++) {

            arrInteger[i] = Integer.valueOf(arr[i]);

        }

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arrInteger)); // Collection

        return Collections.max(arrayList);

    }


    public static int maxNum3(int[] arr) {

        TreeSet<Integer> treeSet = new TreeSet<>(); // TreeSet is a child of Set interface , sorts the elements in ascending order

        for (int i = 0; i < arr.length; i++) {

            treeSet.add(Integer.valueOf(arr[i])); // We need to add the elements as non-primitive data type, that's why we use Integer.valueOf

        }

                    //We need to use the get method from ArrayList, to do so we call the constructor of arrayList
       return new ArrayList<>(treeSet).get(treeSet.size() - 1);


        /*ArrayList<Integer> arrayList = new ArrayList<>(treeSet);


        return arrayList.get(arrayList.size()-1);*/

    }

    //Van Solution
    public static int maxNumb4(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
