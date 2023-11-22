package week_01.nisa_solution;

public class WithoutDivideOperator {
    public static void main(String[] args) {

     divideWithoutOperator(10, 2);
     divideWithoutOperator(7, 2);
     divideWithoutOperator(15, 7);


    }


    public static void divideWithoutOperator(int dividend, int divisor){

        int quotient = 0;
        while (dividend >= divisor){
            dividend = dividend - divisor;
            quotient++;
        }

        System.out.println("quotient = " + quotient);

    }


/*
10/ 2 = 5

10 - 2 = 8
8 - 2 = 6
6 - 2 = 4
4 - 2 = 2
2 - 2 = 0
 */

}
