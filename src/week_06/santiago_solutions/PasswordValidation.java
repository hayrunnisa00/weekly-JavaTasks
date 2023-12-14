package week_06.santiago_solutions;

import javax.swing.table.TableRowSorter;

//String -- Password Validation
// Task 1. Write a return method that can verify if a password is valid or not. requirements:
// 1. Password MUST be at least have 6 characters and should not contain space
// 2. PassWord should at least contain one upper case letter
// 3. PassWord should at least contain one lowercase letter
// 4. Password should at least contain one special characters
// 5. Password should at least contain a digit if all requirements above are met, the method returns true, otherwise returns false
public class PasswordValidation {

    //Test
    public static void main(String[] args) {

        String validPassword = "1019S@nti10,";

        String noValidPassword = "Pas";

        System.out.println("passwordValidation1(validPassword) = " + passwordValidation1(validPassword));
        System.out.println("passwordValidation1(noValidPassword) = " + passwordValidation1(noValidPassword));

        System.out.println("==========================================");

        System.out.println("validPassword2(validPassword) = " + validPassword2(validPassword));
        System.out.println("validPassword2(noValidPassword) = " + validPassword2(noValidPassword));
    }

    public static boolean validPassword2(String password) {

        //I'm going to use the Character class and its methods ( isDigit, isLowerCase, isUpperCase, isSpecialChar

        //I need to iterate each ch in the String, but first I have to convert the string into Character

        boolean hasNotSpaces = !password.contains(" ");
        boolean has6Characters = password.length()>=6;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialCh=false;
        boolean hasDigit = false;

            for (char each : password.toCharArray()) {

                    if (Character.isUpperCase(each)) {
                        hasUpperCase = true;
                    } else if (Character.isLowerCase(each)) {
                        hasLowerCase = true;
                    } else if (Character.isDigit(each)) {
                        hasDigit = true;
                    } else if (!Character.isLetterOrDigit(each)) {
                        hasSpecialCh = true;
                    }
                }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialCh && hasNotSpaces && has6Characters;
    }


    public static boolean passwordValidation1(String password) {

        boolean hasSpecialCh=false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        if (!(password.contains(" ") && password.length() < 6)) {

            for (int i = 0; i < password.length(); i++) {

                char ch = password.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {
                    hasUpperCase = true;
                } else if (ch >= 'a' && ch <= 'z') {
                    hasLowerCase = true;
                } else if (ch >= '0' && ch <= '9') {
                    hasDigit = true;
                } else {
                    hasSpecialCh=true;
                }

                }

        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialCh;

    }

}
