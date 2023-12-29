package week_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntSum_0 {

    public static void main(String[] args) {

        arrSum_0(3);

    }

    public static void arrSum_0(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        if (n >= 1 && n <= 100) {

            if (list.size() < n) {

                if (Integer.sum(n, n) == 0) {

                    for (int i = 0; i < n; i++) {

                        list.add(i);

                    }
                }

            }

        }

        System.out.println(list);
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