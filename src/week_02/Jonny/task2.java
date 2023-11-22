package week_02.Jonny;

public class task2 {
    public static void main(String[] args) {

        String result3 = "Divisible by 3: ";
        String result5 = "Divisible by 5: ";
        String result15 = "Divisible by 15: ";


        for (int i = 1; i <= 100; i++) {
            if (i % 15== 0) {
                result15 += i + " ";
            }else if (i % 5 == 0) {
                result5 += i + " ";
            }else if(i%3==0){
                result3 +=i +" ";
            }
        }
        System.out.println(result3);
        System.out.println(result5);
        System.out.println(result15);
    }}


//Divisible 3, 5, 15