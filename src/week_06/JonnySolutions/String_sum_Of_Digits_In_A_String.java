package week_06.JonnySolutions;

public class String_sum_Of_Digits_In_A_String {
    public static int calculateDigitSum(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String input = "dfjd738djd9";
        int digitSum = calculateDigitSum(input);
        System.out.println(digitSum);
    }
}


//Write a method that can return the sum of the digits in a string