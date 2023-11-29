package week_01.van_solution;

public class EvenOrOdd {

    public static void main(String[] args) {

        int a = 1;

        System.out.println(evenOrOdd(1));

    }

    public static String evenOrOdd(int number){
       return number==0?"Zerro":((number%2==0)?"Even":"Odd");
    }

}
/* Write a method which can identifies given number is even or odd
Ex:
5--> odd
6--> Even
 */
