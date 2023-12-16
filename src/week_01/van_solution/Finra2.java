package week_01.van_solution;

public class Finra2 {
    public static void main(String[] args) {
        printFinra(30);
    }
    public static void printFinra(int nums) {
        for (int i = 1; i <= nums; i++) {

            System.out.print((i % 3 == 0 && i % 5 == 0) ? "FINRA " : (i % 3 == 0) ? "FIN " : (i % 5 == 0) ? "RA " : i+" ");

        }
    }

}
