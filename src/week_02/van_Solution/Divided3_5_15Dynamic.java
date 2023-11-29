package week_02.van_Solution;

public class Divided3_5_15Dynamic {
    public static void main(String[] args) {
        printDivisibleBy(15, "\nDivided by 15: ");
        printDivisibleByButNot(3, 15, "\nDivided by 3 (but not 15): ");
        printDivisibleByButNot(5, 15, "\nDivided by 5 (but not 15): ");
    }
        public static void printDivisibleBy ( int divisor, String message){

            System.out.print(message);
            for (int i = 1; i <= 100; i++) {
                if (i % divisor == 0)
                    System.out.print(i + " ");
            }
        }

        public static void  printDivisibleByButNot( int divisor, int notDivisor, String message){
            System.out.print(message);
            for (int i = 1; i <= 100; i++) {
                if (i % divisor == 0 && i % notDivisor != 0)
                    System.out.print(i + " ");
            }
        }
    }


