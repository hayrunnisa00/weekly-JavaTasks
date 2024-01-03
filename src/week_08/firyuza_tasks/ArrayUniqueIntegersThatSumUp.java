package week_08.firyuza_tasks;

import java.util.Arrays;

public class ArrayUniqueIntegersThatSumUp {

    public static void main(String[] args) {
        int N = 4;

        try {
            int[] result = generateArray(N);
            System.out.println("Generated array: " + Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    public static int[] generateArray(int N) {
        if (N <= 1 || N >= 100 ) {
            throw new IllegalArgumentException("Invalid input.");
        }

        int[] result = new int[N];

        // Generate values from 1 to N-1
        for (int i = 0; i < N - 1; i++) {
            result[i] = i + 1;
        }

        // Add the negation of each value to the array
        for (int i = 0; i < N - 1; i++) {
            result[N - 1] -= result[i];
        }

        return result;
    }

}
