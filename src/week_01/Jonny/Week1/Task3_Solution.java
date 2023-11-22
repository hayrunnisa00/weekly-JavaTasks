package week_01.Jonny.Week1;

public class Task3_Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            String result = "";
            if(i%5==0 && i%3==0) {
                result="FINRA";

            }else if(i%3==0){
                result="FIN";
            } else if(i%5==0){
                result="RA";

            }else{
                result=(i+"");

            }
            System.out.println(result);
        }
    }




}
