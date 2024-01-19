package week_06.JonnySolutions;

public class StringPasswordValidationTask {
    public static void main(String[] args) {
    String password = "Jonny1!";
    if(password.contains(" ")){
        System.err.println("Invalid Password");
        return;
    }
    boolean hasAtLeast6Characters = password.length()>=6;
    boolean containsAtLeast1UppercaseCharacter=false;
    boolean containsAtLeast1LowercaseCharacter=false;
    boolean containsADigit=false;
    boolean containsASpecialCharacter=false;

        for (int i = 0; i < password.length(); i++) {
           char ch = password.charAt(i);
           if(Character.isUpperCase(ch)){
               containsAtLeast1UppercaseCharacter=true;
           }else if(Character.isLowerCase(ch)) {
               containsAtLeast1LowercaseCharacter = true;
           }else if(Character.isDigit(ch)) {
               containsADigit = true;
           }else{
               containsASpecialCharacter = true;
           }
    }
        boolean  isValidStrongPassword = hasAtLeast6Characters && containsADigit && containsASpecialCharacter
                && containsAtLeast1LowercaseCharacter && containsAtLeast1UppercaseCharacter;

        if(isValidStrongPassword){
            System.out.println(password + ": is a valid and strong password");
        }else{
            System.err.println(password + ": is not a valid/strong password");
        }
    }
}



/*String -- Password Validation Task
        1. Write a return method that can verify if a password is valid or not.
        requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
        if all requirements above are met, the method returns true, otherwise returns false
        Array -- Find Maximum
        Write a return method that can verify if a password is valid or not.
        requirements:
        String -- sum of digits in a string
        Write a method that can return the sum of the digits in a string*/