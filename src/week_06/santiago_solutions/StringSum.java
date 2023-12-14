package week_06.santiago_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//String --sum of digits in a string
// Write a method that can return the sum of the digits in a string
public class StringSum {

    public static void main(String[] args) {

        String str = "Cydeo2023";
        System.out.println("sumDigits(str) = " + sumDigits(str));

    }

    public static int sumDigits(String str) {

        int sum = 0;

        for (char each : str.toCharArray()) {

            if (Character.isDigit(each)) {
                sum += each-48;
            }
        }

        return sum;
    }


}
