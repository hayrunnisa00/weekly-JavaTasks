package week_06.van_solution;

import java.util.Arrays;

public class SumOfDigit {
    /*
    Write a method that can return the sum of the digits in a string

     */
    public static void main(String[] args) {
        String str = "a1f3tt56";
        System.out.println(sumOfDigit1(str));
        System.out.println(sumOfDigit2(str));
        System.out.println(sumOfDigit3(str));
//



    }

    public static int sumOfDigit1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                sum += str.charAt(i)-'0';
            }
        }
        return sum;
    }
    public static int sumOfDigit2(String str) {
        int sum=0;
        for (int i = 0; i <str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum+=Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }

    public static int sumOfDigit3(String str) {
        return str.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
    }


}
