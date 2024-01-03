package week_08.firyuza_tasks;

import java.util.Arrays;

public class ArrayMoveZerosToTheEnd {
  public static void main(String[] args) {
    int[] num = {1,0,2,0,3,0,4,0};
    System.out.println(Arrays.toString(moveZeros(num)));
  }

public static int[] moveZeros(int[] nums){
  //making new empty array with same size
  int[] moved = new int[nums.length];//[0,0,0,0,0,0,0,0] 0 default value of array
  int index=0;//starting index from 0


    for(int each : nums){//will go through the values of array

      if(each !=0){//if element is not equal to zero add to the int

        moved[index++]=each;//after first iteration it will move the correct element to index 0
      }
    }

    return moved;

}
}
/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method)
Ex: input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0,0]
 */