package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class F06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int num = Integer.parseInt(number);
        int n = 0;
        int sum = 0;
        int factorial = 1;
        for (int i = 0; i <= number.length() - 1; i++) {
            n = num % 10;
            num /= 10;
            if (n == 0) {
                sum += 1;
            } else {
                for (int j = 1; j <= n; j++) {
                    factorial *= j;
                }
                sum += factorial;
                factorial = 1;
            }
        }
        if (sum == Integer.parseInt(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
