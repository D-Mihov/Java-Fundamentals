package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class F02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n % 10 == 0) {
            System.out.printf("The number is divisible by %d\n", 10);
        } else if (n % 7 == 0) {
            System.out.printf("The number is divisible by %d\n", 7);
        } else if (n % 6 == 0) {
            System.out.printf("The number is divisible by %d\n", 6);
        } else if (n % 3 == 0) {
            System.out.printf("The number is divisible by %d\n", 3);
        } else if (n % 2 == 0) {
            System.out.printf("The number is divisible by %d\n", 2);
        } else {
            System.out.println("Not divisible");
        }
    }
}
