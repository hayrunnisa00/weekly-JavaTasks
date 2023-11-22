package week_02.santiagoSolutions;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        int input = 24;

        String divisibleBy2 = "Codility";
        String divisibleBy3 = "Test";
        String divisibleBy5 = "Coders";

        for (int i = 1; i <= input; i++) {

            if (i%2==0 && i%3!=0 && i%5!=0) { // Divisible by 2
                System.out.println(divisibleBy2); // Codility
            }else if (i % 3 == 0 && i % 2 != 0 && i % 5 != 0) { // Divisible by 3
                System.out.println(divisibleBy3); // Test
            } else if (i % 5 == 0 && i % 2 != 0 && i % 3 != 0) { // Divisible by 5
                 System.out.println(divisibleBy5); // Coders
            } else if (i % 2 == 0 && i % 3 == 0) { // Divisible by 2 and 3
                System.out.println(divisibleBy2+divisibleBy3); // //Codility +Test

            }else if (i % 2 == 0 && i % 5 == 0) { // Divisible by 2 and 5
                System.out.println(divisibleBy2 + divisibleBy5); //  Codility +Coders

            } else if (i % 3 == 0 && i % 5 == 0) { // Divisible by 3 and 5
                System.out.println(divisibleBy3+divisibleBy5); //Test + Coders

            } else if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) { // Divisible by 2,3 and 5
                System.out.println(divisibleBy2 + divisibleBy3 + divisibleBy5); // Codility+Test+Coders
            } else {
                System.out.println(i); // if not print the number
            }

        }

    }

}
/*Number --print consecutive numbers

Write a function:

That, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line
However, any  number divisible by 2,3 or 5 should be replaced by the word Codility, Test or Coders respectively.If a number is divisible
by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this
given order.For example,numbers divisible by both 2 and 3 should be replaced CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

Output ,  here is the output for N=24;

1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17


 */