package week_02.FiryuzaTaskSolutions;

public class SwapTwoVariables {
    public static void main(String[] args) {

        int num1=1;
        int num2=2;

        num1=num2+num1;//a=a+b
        num2=num1-num2;//b=(a+b)-b  b=a
        num1= num1-num2;//a=a-b  a=(a+b)-a

        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
    }
}
