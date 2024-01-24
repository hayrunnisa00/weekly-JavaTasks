package week_08.van_solution;

import java.util.Arrays;

public class N_uniqueArr {

        public static void main(String[] args) {
            int n=6;
            System.out.println(Arrays.toString(sumZero(n)));
            System.out.println(Arrays.toString(sumZero2(n)));
        }
        public static int[] sumZero(int n) {
            int[] result = new int[n];
            int sum =0 ;
            for (int i = 0; i < n - 1; i++) {
                result[i] = i ;
                sum += result[i];
            }
            // last element
            result[n - 1] = -sum;
            return result;
        }
        public static int[] sumZero2(int n) {
            int[] arr = new int[n];
            int firstElement = -(n/2);
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                arr[i] = firstElement;
                sum += firstElement;
                firstElement++;
            }

            // the last element

            arr[n - 1] = -sum;


            return arr;

        }
    }
/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
 */

