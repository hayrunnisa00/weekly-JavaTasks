package week_01;

public class Task2_Solution {
    public static void main(String[] args) {


        int n1 = 1;
        int n2 = 20;
        int result = 0;

        while (n1 <= n2) {
            n2-=n1;//num2-num1=result
            result+=1;//result= amount of times result-num1 can be done, repeat till not longer and add the amount of succesful attemps

        }
        System.out.println(result);
    }
}


