package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class F11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double tHeadset = Math.floor(lGamesCount / 2);
        double tMouse = Math.floor(lGamesCount / 3);
        double tKeyboard = Math.floor(lGamesCount / 6);
        double tDisplay = Math.floor(tKeyboard / 2);
        double expenses = headsetPrice * tHeadset + mousePrice * tMouse + keyboardPrice * tKeyboard + displayPrice * tDisplay;
        System.out.printf("Rage expenses: %.2f lv.\n", expenses);
    }
}
