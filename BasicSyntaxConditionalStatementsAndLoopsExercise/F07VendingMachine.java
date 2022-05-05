package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class F07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double money = 0.0;

        while (!input.equals("Start")) {
            double currentMoney = Double.parseDouble(input);
            if (currentMoney == 0.1 || currentMoney == 0.2 || currentMoney == 0.5 || currentMoney == 1 || currentMoney == 2) {
                money += currentMoney;
            }else {
                System.out.printf("Cannot accept %.2f\n", Double.parseDouble(input));
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (money < 2) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    money -= 2;
                    System.out.printf("Purchased %s\n", input);
                    break;
                case "Water":
                    if (money < 0.7) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    money -= 0.7;
                    System.out.printf("Purchased %s\n", input);
                    break;
                case "Crisps":
                    if (money < 1.5) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    money -= 1.5;
                    System.out.printf("Purchased %s\n", input);
                    break;
                case "Soda":
                    if (money < 0.8) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    money -= 0.8;
                    System.out.printf("Purchased %s\n", input);
                    break;
                case "Coke":
                    if (money < 1) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    money -= 1;
                    System.out.printf("Purchased %s\n", input);
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f\n", money);
    }
}
