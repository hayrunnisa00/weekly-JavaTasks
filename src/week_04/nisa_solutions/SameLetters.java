package week_04.nisa_solutions;

public class SameLetters {
    public static void main(String[] args) {

        String word1 = "acb";
        String word2 = "cba";

        System.out.println(sameLetters(word1, word2));

        String w1 = "abc";
        String w2 = "bbac";

        System.out.println(sameLetters(w1, w2));


    }

    private static boolean sameLetters(String word1, String word2) {

        boolean allLettersSame = true;

        for (int i = 0; i < word1.length(); i++) {

            if (word1.length() != word2.length() || !word2.contains(word1.charAt(i) + "")){
                allLettersSame = false;
                break;
            }

        }

        return allLettersSame;

    }


}
