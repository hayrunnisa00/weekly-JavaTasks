package week_02.van_Solution;

public class CodilityTestCoders {

    public static void main(String[] args) {

        int n = 24;

        for (int i = 1; i <= n; i++) {

            String result = (i % 2 == 0 ? "Codility" : "") + (i % 3 == 0 ? "Test" : "") + (i % 5 == 0 ? "Coders" : "");


            System.out.println(result.isEmpty() ? i : result);
        }
    }
    }

