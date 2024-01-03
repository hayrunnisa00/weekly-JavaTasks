package week_08.Jonny_Solutions;

public class Array_Move_Zeros_To_The_End {
    public static void main(String[] args) {
        int arr[]={0,6,0,7,9,0,3,3,0};//create array that includes 0's
        int len=arr.length;//declare variable for the length of the array
        int count = 0;//make a count variable

        for (int i = 0; i < len; i++) {
            /* fori loop that lets us see the
             length of the array and check each number*/

            if (arr[i]!=0){
                /*while checking array numbers if
                 a number does not = 0 it is added to the count*/
                arr[count++] = arr[i];
            }
        }
   while(count<len){
       /*while loop, while the count is less than the
        length add the 0's to the end of the array*/
       arr[count++]=0;
   }
        for (int j= 0; j < len; j++) {
            /*now we need another for loop using j so when
            printing the 0's can be added to the array*/
            System.out.println(arr[j]);
        }
    }
}
/* Array - Move Zeros to the End

 Write a method that can move all the zeros to last indexes of the array (Do
 Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
 0]*/