package week_08.nisa_solutions;

import java.util.*;

public class UniqueArray {
    public static void main(String[] args) {

        int num = 4;
        System.out.println(Arrays.toString(uniqueArray(num)));


    }

    private static int[] uniqueArray(int n) {

        int[] arr = new int[n];
        ArrayList<Integer> usedNum = new ArrayList<>();

        Random random = new Random();  // 0 ~ 10
        int randomNum;
        int sum = 0;


        for (int i = 0; i < arr.length-1; i++) {
            do {
                randomNum = random.nextInt(10)-5;  // range --> (-5 ~ 5)
            }
           while (usedNum.contains(randomNum));
               usedNum.add(randomNum);
               arr[i] = usedNum.get(i);
               sum += arr[i];

               if (usedNum.contains(-sum)){
                   arr[i] = random.nextInt(10)-5;
               }
        }

        arr[arr.length-1] = -sum;

       return arr;
    }



}
