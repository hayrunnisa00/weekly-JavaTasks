package week_06;

public class PasswordValidation {

    public static void main(String[] args) {

        String password = "asdR.f4654";

        System.out.println(verifyPassword(password));


    }

    public static boolean verifyPassword(String password) {

        boolean validPassword = false;

        if (password.length() >= 6 && !password.contains(" ")) {

            for (int i = 0; i < password.length(); i++) {

                char ch = password.charAt(i);

                if (Character.isUpperCase(ch) || Character.isLowerCase(ch) || !Character.isLetterOrDigit(ch) || Character.isDigit(ch)) {
                    validPassword = true;
                }


            }

        }
        return validPassword;

    }
}
