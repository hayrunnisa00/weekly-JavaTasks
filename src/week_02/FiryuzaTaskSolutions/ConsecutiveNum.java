package week_02.FiryuzaTaskSolutions;

import java.util.Scanner;

public class ConsecutiveNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        
        String result="";
        for (int i = 1; i <= num; i++) {
            if(i%2==0 && i%3==0 && i%5==0){
                result = "CodilityTestCoders";
            } else if (i%2==0 && i%3==0) {
                result = "CodilityTest";
            }else if (i%2==0 && i%5==0) {
                result = "CodilityCoders";
            }else if(i%3==0 && i%5==0){
                result="TestCoders";
                
            } else if (i%2==0) {
                result="Codility";

            } else if (i%3==0) {
                result="test";

            } else if (i%5==0) {
                result="Coders";

            } else{
                result=i+"";
            }
            System.out.println(result);

        }

        
    }
}
