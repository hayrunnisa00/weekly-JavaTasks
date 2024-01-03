package week_06.firyuzaSolution;

public class Array_FindMaximum {

    public static void main(String[] args) {

     int [] arr ={3,4,5,1,10,-1,3};
        System.out.println(maxNum(arr));

    }

    public static int maxNum(int[] arr){
        int max=arr[0];
        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

}
/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */