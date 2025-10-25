package FunctionalInterfaces;

interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        // Password rules: at least 8 chars, 1 uppercase, 1 digit, 1 special char
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[@#$%^&+=!].*");
        boolean minLength = password.length() >= 8;

        return hasUpper && hasDigit && hasSpecial && minLength;
    }
}
public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String pwd1 = "Admin@123";
        String pwd2 = "weakpass";
        System.out.println("Password: " + pwd1 + " -> Strong? " + SecurityUtils.isStrongPassword(pwd1));
        System.out.println("Password: " + pwd2 + " -> Strong? " + SecurityUtils.isStrongPassword(pwd2));
    }
}
