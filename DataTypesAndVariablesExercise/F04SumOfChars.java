package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class F04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String letter = "";
        int sum = 0;
        for (int i = 0; i < n; i++) {
            letter = scanner.nextLine();
            sum += letter.charAt(0);
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
