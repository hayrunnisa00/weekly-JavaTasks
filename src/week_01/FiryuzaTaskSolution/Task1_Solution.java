package week_01.FiryuzaTaskSolution;

public class Task1_Solution {
    public static void main(String[] args) {

        Finra();
    }
    public static void Finra() {

        String result = "";

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else
                result += i + " ";


        }
        System.out.print(result);

    }
}
