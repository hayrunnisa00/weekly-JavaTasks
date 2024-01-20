package week_09.nisa_solutions;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {

        String[] arr1 = {"apple", "banana"};
        String [] arr2 = {"tomato", "onion", "cucumber"};

        System.out.println(Arrays.asList(concat(arr1, arr2)));

    }


    public static String[] concat(String[] arr1, String[] arr2){

        String [] arrSum = new String[arr1.length + arr2.length];
        int indexNo = 0;

        for (int i = 0; i < arr1.length; i++) {

           arrSum[indexNo] = arr1[i];
           indexNo++;

        }

        for (int i = 0; i < arr2.length; i++) {

            arrSum[indexNo] = arr2[i];
            indexNo++;

        }

        return arrSum;

    }


}
