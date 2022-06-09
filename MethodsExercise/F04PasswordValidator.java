package MethodsExercise;

import java.util.Scanner;

public class F04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        passwordValidator(password);
    }

    private static void passwordValidator(String password) {
        int count = 0;
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            count++;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                System.out.println("Password must consist only of letters and digits");
                count++;
                break;
            }
        }
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            System.out.println("Password must have at least 2 digits");
            count++;
        }
        if (count == 0) {
            System.out.println("Password is valid");
        }
    }
}
