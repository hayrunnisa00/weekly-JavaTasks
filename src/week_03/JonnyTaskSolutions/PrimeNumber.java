package week_03.JonnyTaskSolutions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, if number entered is not prime you will receive an error message. " +
                "\nIf no error message received number is prime");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.err.println(number + " is divisible by another number besides 1 and itself, therefore number is not prime");
                break;

}


        }}}



/*write a method that can check if a number is prime or not*/