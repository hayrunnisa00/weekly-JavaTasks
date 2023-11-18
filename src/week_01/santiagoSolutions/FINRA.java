package week_01.santiagoSolutions;

public class FINRA {
    public static void main(String[] args) {


        for (int i = 1; i <= 30; i++) {

            String result = "";

            if (i%3==0 & i%5==0) {// for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number
                result="FINRA";
            }else if (i%3==0) { //  for numbers which are a multiple of 3 print "FIN" instead of the number
                result="FIN";
            }else if (i%5==0){ //for numbers which are a multiple of 5, print "RA" instead of the number.
                result="RA";
            } else { // any number that's nor in the last conditions jusrt print the number
                result=i+"";
            }

            System.out.print(result+" ");
        }

    }
}/*
FINRA :
        Write
        a method which prints out the numbers from 1 to 30 but for numbers which
        are a multiple of 3 print "FIN" instead of the number and for numbers which are a
        multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
        both 3 and 5, print "FINRA" instead of the number.*/