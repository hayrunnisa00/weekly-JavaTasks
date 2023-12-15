package week_06.nisa_solutions;

public class SumOfDigits {
    public static void main(String[] args) {

        String word = "Java18Selenium25";
        // 1 + 8 + 2 + 5 = 16

        System.out.println(sumDigit(word));


    }

    private static int sumDigit(String word) {

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))){
                //sum += word.charAt(i);  --> it is adding ascii table value
                sum += Integer.parseInt(word.charAt(i) + "");  // Converts String to an int type. (Wapper Class)
            }
        }


        return sum;
    }


}

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */