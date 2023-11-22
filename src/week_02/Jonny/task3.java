package week_02.Jonny;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
String result ="";
        for (int i = 1; i <= n; i++) {
            if((i%2!=0 && i%3!=0 && i%5!=0)){
                result+=i;
            }
if(i%2==0) {
    result += "Codility";
}
if (i%3==0) {
    result += "Test";
}
if (i%5==0){
   result+="Coders";
}
    System.out.println(result);
    result="";
        }

    }}

//print consecutive numbers