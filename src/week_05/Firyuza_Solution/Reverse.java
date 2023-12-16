package week_05.Firyuza_Solution;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(revers("ABCD"));

    }

    public static String revers(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;

    }

}


/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */