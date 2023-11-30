package week_01.van_solution;

public class DivideWithoudOperator {

    public static void main(String[] args) {
        int a= 3;
        int b = 0;

            System.out.println(divideWithoudOperator(a,b));


    }

    public static String divideWithoudOperator(int num1,int num2){
        int count = 0;
        if (num2==0){
            System.err.println("Divisor can't be Zero");
            System.exit(1);
        }
        if(num1>=num2){
            for (int i = 0; i < num1; i++) {
                num1-=num2;
                count++;
            }
        }
        return count+" with a remainder of "+num1 ;


    }
}
//Write a method can divide two number without using division operator
