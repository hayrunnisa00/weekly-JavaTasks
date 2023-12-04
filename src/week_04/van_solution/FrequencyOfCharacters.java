package week_04.van_solution;
/*
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
       String str=  "AAABBCDD";
        System.out.println(frequencyOfCharacter(str));
    }
    public static String frequencyOfCharacter(String str) {

        String result="";

        for (int i = 0; i < str.length(); i++) {//loop go through the string
            char ch = str.charAt(i);// char at i
            int count = 0;// counting the repeat of char at i
            for (int j = 0; j < str.length(); j++) {//tracking the char frequency
                if (ch == str.charAt(j)) {
                    count++;

                }

            }
            if (result.contains(""+ch)){// not repeat the charater
                continue;
            }
            result+= ""+ch + count;
        }
        return result;
    }
}
