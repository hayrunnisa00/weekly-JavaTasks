package week_01.lokmanSolution;

public class DivideWithoutOperator {

    public static void main(String[] args) {


        int num1 = 50;
        int num2 = 10;
        int count = 0;

        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }

        System.out.println("count = " + count);

    }
}