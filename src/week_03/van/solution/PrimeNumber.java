package week_03.van.solution;

public class PrimeNumber {
//    Write a method that can check if a number is prime or not


    public static void main(String[] args) {
        int num =3;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
    public static boolean isPrime(int number){
        if (number<=1){
            return false;
        }
        // Check divisibility from 2 up to the number itself
        for (int i = 2; i * i<=number; i++) {
            if(number%i == 0){ //If the number is divisible by 'i', it's not prime
                return false;
            }
        }
        return true;
    }
}
