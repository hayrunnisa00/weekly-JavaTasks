package week_01;

public class Task2_Solution {

    public static void main(String[] args) {

        int num1=50;
        int num2=10;

        int count=0;

        while(num1>=num2){

            num1-=num2; //num1-num2=40, num1=40;

            count++;

        }
        System.out.println("count = " + count);



    }
}
