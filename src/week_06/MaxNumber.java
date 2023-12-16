package week_06;

public class MaxNumber {

    public static void main(String[] args) {

        int[] arr = {5,10,78,62,61,2,5};
        maxNum(arr);
    }

    public static void maxNum(int[] arr){

        int max = Integer.MIN_VALUE;

        for (int each: arr){

            if (each> max){
                max = each;
            }

        }
        System.out.println(max);

    }


}
/*
Array -- Find Maximum Write a method that can find the maximum number from an int Array
 */