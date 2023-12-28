package week_06.van_solution;

import java.util.Arrays;

public class ArrayFindMaximum {
    public static void main(String[] args) {
        int [] arr = {5,8,6,5,9,1,3,5,0,7};
        System.out.println("max(arr) = " + max(arr));
        System.out.println(max1(arr));
        System.out.println("max2(arr) = " + max2(arr));
    }
    public static int max (int[]  arr){
        int max = Integer.MIN_VALUE;
        for (int each   :   arr) {
            if (each>max) {
                max=each;
            }
        }
        return max;
    }
    public static int max1 (int[]  arr){
        return Arrays.stream(arr).max().getAsInt();
    }
    public static int max2 (int[]  arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}