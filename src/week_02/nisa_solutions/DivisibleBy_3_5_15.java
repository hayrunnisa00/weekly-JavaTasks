package week_02.nisa_solutions;

public class DivisibleBy_3_5_15 {
    public static void main(String[] args) {

        divisibleBy_3_5_15(100);

    }

    private static void divisibleBy_3_5_15(int i) {

        String result15 = "Divisible By 15= ";
        String result5 = "Divisible By 5= ";
        String result3 = "Divisible By 3= ";

        for (int j = 1; j < i; j++) {

            if (j % 5 == 0 && j % 3 == 0){
                result15 += j + " ";
            } else if (j % 5 == 0) {
                result5 += j + " ";
            }else if (j % 3 == 0 ) {
                result3 += j + " ";
            }

        }

        System.out.print(result15.trim());
        System.out.println();
        System.out.print(result5.trim());
        System.out.println();
        System.out.print(result3.trim());



    }
}
