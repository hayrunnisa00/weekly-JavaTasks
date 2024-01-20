package week_06.lokman_solutions;

public class PasswordValidationTaks {
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
    public static void main(String[] args) {
        String password1 = "frdf1";
        String password2 = "fg53 gfb";
        String password3 = "ajhaj78";
        String password4 = "ASDD77*&^";
        String password5 = "aAG%^&123";

        System.out.println(isValidPassword(password1));
        System.out.println(isValidPassword(password2));
        System.out.println(isValidPassword(password3));
        System.out.println(isValidPassword(password4));
        System.out.println(isValidPassword(password5));

        System.out.println("verifyPassword(password1) = " + verifyPassword(password1));
        System.out.println("verifyPassword(password2) = " + verifyPassword(password2));
        System.out.println("verifyPassword(password3) = " + verifyPassword(password3));
        System.out.println("verifyPassword(password4) = " + verifyPassword(password4));
        System.out.println("verifyPassword(password5) = " + verifyPassword(password5));

    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        boolean[]target = new boolean[4];
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                target[0] = true; // Uppercase check
            } else if (Character.isLowerCase(ch)) {
                target[1] = true; // Lowercase check
            } else if (Character.isDigit(ch)) {
                target[2] = true; // Digit check
            } else if(!Character.isLetterOrDigit(ch)){
                target[3] = true; // Special character check
            }

        }

        // Checking if all conditions met
        for (boolean each : target) {
            if (!each) {
                return false;
            }
        }

        return true;
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













