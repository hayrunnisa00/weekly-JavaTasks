package week_03.santiago_solutionsWeek3;

public class PrimeNumbers {
    ///Prime Numbers : Prime numbers are natural numbers greater
    // than 1 that have no positive divisors other than 1 and themselves.
    // In other words, a prime number is a whole number greater than 1 that
    // cannot be formed by multiplying two smaller whole numbers.

    //Examples:
    //Examples of prime numbers include 2, 3, 5, 7, 11, 13, 17, 19, and so on.

    public static void main(String[] args) {

        //T1 num=2 // true
        System.out.println("isPrime(2) = " + isPrime(2));
        //T2 num=4 // false
        System.out.println("isPrime(4) = " + isPrime(4));

    }
    public static boolean isPrime(int num) {

        boolean isPrime=false;
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                isPrime = true;
            } else {
                isPrime = false;
            }

        }

        return isPrime;

    }

}
