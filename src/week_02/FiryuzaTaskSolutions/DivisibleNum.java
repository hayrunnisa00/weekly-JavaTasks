package week_02.FiryuzaTaskSolutions;

public class DivisibleNum {
    public static void main(String[] args) {

        String result15="Divisible by 15: ";
        String result3="Divisible by 3: ";
        String result5="Divisible by 5: ";

        for (int i = 1; i <= 100; i++) {

            if(i%15==0){
                result15 +=i+" ";
            } else if (i%3==0) {
                result3 +=i+" ";

            } else if (i%5==0) {
                result5 += i + " ";
            }

        }
        System.out.println( result15);
        System.out.println(result5);
        System.out.println(result3);

    }
}
