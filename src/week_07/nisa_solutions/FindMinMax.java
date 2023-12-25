package week_07.nisa_solutions;

import java.util.Arrays;

public class FindMinMax {

    public static void main(String[] args) {

        int[] arr = {3, 45, 78, 32, 743, 54};

        System.out.println(findMinNumber(arr));

    }

    private static int findMinNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[0];

    }


}
