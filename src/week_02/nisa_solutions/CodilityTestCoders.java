package week_02.nisa_solutions;

import java.util.Scanner;

public class CodilityTestCoders {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive number");
        int n = scanner.nextInt();


        CodilityTestCoders(n);



    }

    private static void CodilityTestCoders(int n) {

        String divisible2 = "Codility";
        String divisible3 = "Test";
        String divisible5 = "Coders";
        String result = "";

        for (int i = 1; i <= n ; i++) {

            if (i%2!=0 && i%3!=0 && i%5!=0){
                result +=  i;
            }
            if (i % 2 == 0) {
                result += divisible2;
            }
            if (i % 3 == 0) {
                result += divisible3;
            }
            if (i % 5 == 0) {
                result += divisible5;

            }
            System.out.println(result);
                result = "";



        }



    }


}
