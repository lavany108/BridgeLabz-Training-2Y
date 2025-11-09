package Exceptions;
import java.util.Scanner;

public class LoginSystem {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";
    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(VALID_USERNAME)) {
            throw new InvalidCredentialsException("Invalid Username!!");
        }
        if (!pass.equals(VALID_PASSWORD)) {
            throw new InvalidCredentialsException("Incorrect Password for user '" + user + "'.");
        }
        System.out.println("Login Successful! Welcome, " + user + ".");
    }
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();
            try {
                login.validate(username, password);
                loggedIn = true;
            } catch (InvalidCredentialsException e) {
                System.err.println("Login Failed!! " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
        scanner.close();
    }
}