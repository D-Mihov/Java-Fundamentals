package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class F05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String attempt = "";
        String password = "";
        int count = 0;

        for (int i = user.length() - 1; i >= 0; i--) {
            password += user.charAt(i);
        }

        while (true) {
            attempt = scanner.nextLine();
            count++;
            if (attempt.equals(password)) {
                System.out.printf("User %s logged in.\n", user);
                break;
            } else if (count == 4) {
                System.out.printf("User %s blocked!\n", user);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }
    }
}
