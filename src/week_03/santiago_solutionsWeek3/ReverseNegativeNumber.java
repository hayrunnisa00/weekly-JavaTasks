package week_03.santiago_solutionsWeek3;

public class ReverseNegativeNumber {


    public static void main(String[] args) {

        System.out.println("reverseNum(53) = " + reverseNum(53));


        System.out.println("reverseNum(-32) = " + reverseNum(-32));


    }



    public static int reverseNum(int  num) {

        String reverse = "";
        if (num < 0) {

            num = -1 * num;

        } else {
            return num;
        }

        String strNum = Integer.toString(num);
        String strReverse = "";

        for (int i = strNum.length()-1; i >= 0; i--) {
            strReverse += strNum.charAt(i);
        }

        return Integer.valueOf(strReverse);
    }


    //Emma Solutions isn't right. it's reversing the positive numbers as well.
    // The solution is after line 41

     /*  public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }

        return Integer.valueOf(str);
    }*/
   /* public static int reverse(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }*/
}

