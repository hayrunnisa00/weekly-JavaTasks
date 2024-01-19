package week_03.JonnyTaskSolutions;

import java.util.Scanner;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
int number = -514;
        if(number<0){
            System.out.println(number * -1);
        }else{
            System.err.println("int number must enter a negative number for this exercise");
        }
    }
}

//Write a return method that can reverse negative number and return it as int