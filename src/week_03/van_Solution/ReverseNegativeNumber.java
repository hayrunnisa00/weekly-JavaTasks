package week_03.van_Solution;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int negativeNumber = -12045;

        System.out.println("Reversed Negative Number: " + reverseNegative(negativeNumber));
}
    public static int reverseNegative(int number) {
        if (number >= 0) {
            return number;
        } else {
            int reversed = 0;
            int posNum = Math.abs(number); // Get the main value positive

            while (posNum != 0) {
                int digit = posNum % 10; //  the last digit
                reversed = reversed * 10 + digit; // get the reversed number
                posNum /= 10; // Move to the next digit
            }
            return -reversed; // Return as a negative number
        }
    }
}
/*
Numbers -- Reverse negative number
Write a return method that can reverse'
negative number and return it as int'
 */