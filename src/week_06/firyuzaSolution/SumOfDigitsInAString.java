package week_06.firyuzaSolution;

public class SumOfDigitsInAString {

    public static void main(String[] args) {
        String str="A12B34C56";
        System.out.println(sumOfDigits(str));

    }
    public static int sumOfDigits(String str ){
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                sum +=ch-48;
            }

        }
       return sum;
    }

}
/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */