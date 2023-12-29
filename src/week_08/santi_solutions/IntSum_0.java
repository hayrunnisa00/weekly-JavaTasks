package week_08.santi_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntSum_0 {



    public static void main(String[] args) {
        int n = 5;
        int[] resultArray = createArrayWithZeroSum(n);

        System.out.print("Result array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(resultArray[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int sum = 0;
        for (int value : resultArray) {
            sum += value;
        }
        System.out.println("Sum of the elements: " + sum);
    }


    //This was ChatGPT
    public static int[] createArrayWithZeroSum(int n) {
        int[] array = new int[n];

        if (n % 2 == 0) {
            // If n is even, fill the array with n/2 positive numbers
            for (int i = 0; i < n / 2; i++) {
                array[i] = i + 1;               // Positive numbers
                array[n - 1 - i] = -(i + 1);    // Corresponding negative numbers
            }
        } else {
            // If n is odd, fill the array with (n-1)/2 positive numbers
            for (int i = 0; i < (n - 1) / 2; i++) {
                array[i] = i + 1;               // Positive numbers
                array[n - 1 - i] = -(i + 1);    // Corresponding negative numbers
            }
            // Set the middle element to 0
            array[n / 2] = 0;
        }

        return array;
    }

    }



// Array - N unique integers that sum up to 0
//
// Write a function that given an integer N (1 < N < 100), returns an array
// containing N unique integers that sum up to 0. The function can return any
// such array.
//
// For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
// The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
// For N = 3 one of the possible answers is [-1,0,1] (but there are many more
// correct answers).