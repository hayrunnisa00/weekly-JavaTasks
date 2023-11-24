package week_03.nisa_solutions;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverseNumber(-3));
        System.out.println(reverseNumber(-10));
        System.out.println(reverseNumber(-589));


    }

    private static int reverseNumber(int num) {

        return 0 - num;   // 0 - (-3)

    }
}
