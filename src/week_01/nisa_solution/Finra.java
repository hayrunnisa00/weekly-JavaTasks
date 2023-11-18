package week_01.nisa_solution;

public class Finra {
    public static void main(String[] args) {

        finra();

    }


    public static void finra(){

        for (int i = 1; i <= 30; i++) {

            if (i % 5 == 0 && i % 3 == 0){
                System.out.print("FINRA ");
            }else if (i % 3 == 0){
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            }else {
                System.out.print(i + " ");
            }


        }

    }


}
