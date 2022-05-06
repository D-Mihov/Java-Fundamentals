package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class F09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        double pricePerCapsule = 0.0;
        int days = 0;
        int capsulesCount = 0;
        double current = 0.0;
        double total = 0.0;

        for (int i = 0; i < N; i++) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());
            current = pricePerCapsule * days * capsulesCount;
            total += current;
            System.out.printf("The price for the coffee is: $%.2f\n", current);
        }
        System.out.printf("Total: $%.2f\n", total);
    }
}
