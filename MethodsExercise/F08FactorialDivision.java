package MethodsExercise;

import java.util.Scanner;

public class F08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        double factorialNumber1 = factorial(num1);
        double factorialNumber2 = factorial(num2);
        double result = factorialNumber1 / factorialNumber2;
        System.out.printf("%.2f%n", result);
    }

    private static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
