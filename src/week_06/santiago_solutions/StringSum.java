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
        System.out.println("--------------------------------------");
        String str2 = "Hello World";
        System.out.println("sumDigits(str2) = " + sumDigits(str2));

    }

    public static int sumDigits(String str) {

        int sum = 0; // This variable contains the sum of the digits found in the Array

        for (char each : str.toCharArray()) { // We use forEach loop to get each element inside the String

            if (Character.isDigit(each)) { // We use isDigit method from Character class
                sum += each-48;// if it's true we will add the character as a num( we need to rest 48 because the number returning is from the ASCII table)

            }
        }

        return sum;
    }


}
