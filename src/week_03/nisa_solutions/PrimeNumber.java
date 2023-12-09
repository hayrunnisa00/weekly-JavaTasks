package week_03.nisa_solutions;

public class PrimeNumber {
    public static void main(String[] args) {


        primeNumber(997);
        primeNumber(677);
        primeNumber(19);
        primeNumber(1217);
        primeNumber(1218);
        primeNumber(17);
        primeNumber(78);
    }

    private static void primeNumber(int num) {

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0){
              isPrime = false;
            }

        }

        System.out.println(num + " = " + isPrime);

    }
}
