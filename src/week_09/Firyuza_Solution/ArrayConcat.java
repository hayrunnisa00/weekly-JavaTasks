package week_09.Firyuza_Solution;

import java.util.Arrays;

public class ArrayConcat {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5};
        int[] arr2 ={6,7,8,9};

        int[] newArray = new int[arr1.length + arr2.length];

        for (int i = 0, y=0; i < newArray.length; i++){

            if(i < arr1.length){
                newArray[i]=arr1[i];
            }else{
                newArray[i]=arr2[y++];
            }

        }

        System.out.println(Arrays.toString(newArray));

    }

}
//Write a return method that can concatenate two arrays