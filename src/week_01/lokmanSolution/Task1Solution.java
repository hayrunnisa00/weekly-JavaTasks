package week_01.lokmanSolution;

public class Task1Solution {

    public static void main(String[] args) {

        System.out.println(Finra(100));
    }
    public static String Finra(int num) {

        String result = "";

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result = "FINRA";
            } else if (i % 5 == 0) {
                result = "RA";
            } else if (i % 3 == 0) {
                result = "FIN";
            } else
                result = i + "";
            System.out.print(result + " ");
        }
        return result;


    }

}
