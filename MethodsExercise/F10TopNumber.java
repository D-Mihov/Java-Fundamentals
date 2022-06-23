package MethodsExercise;

import java.util.Scanner;

public class F10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if (checkIfSumIsDivisibleBy8(i)) {
                if (checkOddDigit(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean checkOddDigit(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    private static boolean checkIfSumIsDivisibleBy8(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum % 8 == 0;
    }
}
