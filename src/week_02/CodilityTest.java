package week_02;

import java.util.Scanner;

public class CodilityTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int number: ");
        int n = scanner.nextInt();

        String result ="";
        for (int i = 1; i <= n; i++) {

            if (i%2!=0 && i%3!=0 && i%5!=0){
                result+=i;
            }

            if (i%2==0){
                result+="Codility";
            }
            if (i%3==0 ) {
                result+="Test";
            }
            if (i%5==0) {
                result+="Coders";
            }
            System.out.println(result);
            result="";
        }



    }

}
