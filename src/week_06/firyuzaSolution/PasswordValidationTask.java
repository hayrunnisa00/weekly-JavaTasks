package week_06.firyuzaSolution;

public class PasswordValidationTask {

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
/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */