package week_02.nisa_solutions;

public class SwapNumber {
    public static void main(String[] args) {

        int num1 = 4;  // a
        int num2 = 7;  // b

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 + num2;  // a = a + b
        num2 = num1 - num2;  // b = (a + b) - b   b = a
        num1 = num1 - num2; //  a = a - b    a = (a + b) - a   a = b


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);






    }
}
