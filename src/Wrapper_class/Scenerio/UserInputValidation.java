package Wrapper_class.Scenerio;

public class UserInputValidation {
    public static boolean validateAge(String ageString) {
        try {
            int age = Integer.parseInt(ageString);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        String age1 = "25";
        String age2 = "17";
        String age3 = "fifty";
        String age4 = "-5";
        System.out.println("Age: " + age1 + ", Valid: " + validateAge(age1));
        System.out.println("Age: " + age2 + ", Valid: " + validateAge(age2));
        System.out.println("Age: " + age3 + ", Valid: " + validateAge(age3));
        System.out.println("Age: " + age4 + ", Valid: " + validateAge(age4));
    }
}

