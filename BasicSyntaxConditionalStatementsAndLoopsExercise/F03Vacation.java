package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class F03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        if (groupType.equals("Students")) {
            if (day.equals("Friday")) {
                price = group * 8.45;
            } else if (day.equals("Saturday")) {
                price = group * 9.8;
            } else if (day.equals("Sunday")) {
                price = group * 10.46;
            }
            if (group >= 30) {
                price = price - price * 0.15;
            }
        } else if (groupType.equals("Business")) {
            if (group >= 100) {
                group -= 10;
            }
            if (day.equals("Friday")) {
                price = group * 10.9;
            } else if (day.equals("Saturday")) {
                price = group * 15.6;
            } else if (day.equals("Sunday")) {
                price = group * 16;
            }
        } else if (groupType.equals("Regular")) {
            if (day.equals("Friday")) {
                price = group * 15;
            } else if (day.equals("Saturday")) {
                price = group * 20;
            } else if (day.equals("Sunday")) {
                price = group * 22.5;
            }
            if (group >= 10 && group <= 20) {
                price = price - price * 0.05;
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
