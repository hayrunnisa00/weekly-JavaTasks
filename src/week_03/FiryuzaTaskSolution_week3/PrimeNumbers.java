package week_03.FiryuzaTaskSolution_week3;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(isPrime(3));//true
        System.out.println(isPrime(4));//false
        System.out.println(isPrime(5));//true
        System.out.println(isPrime(6));//false

    }

    public static boolean isPrime(int n){

        for (int i = 2; i < n; i++) {// we are trying to find n that are divisible by 2
            if(n % i == 0){//if n evenly divisible by 2 then it's not a prime num
                return false;//we prove that statement above is wrong, which means not a prime num
            }
        }

        return true;//we are assume that all the numbers is prime

    }


}
