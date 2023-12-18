package week_06.nisa_solutions;

public class PasswordValidationTask {
    public static void main(String[] args) {

        String password = "asdR.f4654";
        System.out.println("verifyPassword(password) = " + verifyPassword(password));

        String password2 = "fg53 gfb";
        System.out.println("verifyPassword(password2) = " + verifyPassword(password2));

        String password3 = "frdf1";
        System.out.println("verifyPassword(password3) = " + verifyPassword(password3));

        String password4 = "ajhaj78";
        System.out.println("verifyPassword(password4) = " + verifyPassword(password4));

        String password5= "ASDD77*&^";
        System.out.println("verifyPassword(password5) = " + verifyPassword(password5));

        String password6 = "aAG%^&123";
        System.out.println("verifyPassword(password6) = " + verifyPassword(password6));




    }

    public static boolean verifyPassword(String password) {

        boolean validPassword = false;
        int upperCase = 0;
        int lowerCase = 0;
        int specialChar = 0;
        int digit = 0;


        if (password.length() >= 6 && !password.contains(" ")) {

            for (int i = 0; i < password.length(); i++) {

                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)){
                    upperCase ++;
                }
                if (Character.isLowerCase(ch)){
                    lowerCase ++;
                }
                if (ch >= 33 && ch <= 47) {
                    specialChar++;
                }
                if (Character.isDigit(ch)) {
                    digit++;
                }

                if (upperCase >= 1 && lowerCase >= 1 && specialChar >= 1 && digit >= 1){
                    validPassword = true;
                }

            }

        }
        return validPassword;

    }


}

/*
Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */