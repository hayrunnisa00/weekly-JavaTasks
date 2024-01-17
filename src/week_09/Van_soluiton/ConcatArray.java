package week_09.Van_soluiton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatArray {
    public static void main(String[] args) {
        int [] arr1 ={1,2,6,8};
        int [] arr2 ={0,2,4,8};
        System.out.println(Arrays.toString(concatArray(arr1, arr2)));
        System.out.println(Arrays.toString(concatArray1(arr1, arr2)));
        System.out.println(Arrays.toString(concatArray2(arr1, arr2)));
    }
    public static int[] concatArray(int[] arr1, int[] arr2){
        int[] newArr=new int[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[i+arr1.length]=arr2[i];

        }

        return newArr;
    }

    public static int[] concatArray1(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
        list.add(arr1[i]);
        }
        for (int nums : arr2) {
            list.add(nums);
        }
        int [] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i]=list.get(i);
        }
        return newArr;
    }
    public static int[] concatArray2(int[] arr1, int[] arr2){
       return Arrays.copyOf(concatArray(arr1,arr2),arr1.length+arr2.length);
    }


}
/*
1) Array - Concat two arrays
Write a return method that can concate two arrays
 */