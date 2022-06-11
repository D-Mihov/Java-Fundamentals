package MethodsExercise;

import java.util.Scanner;

public class F05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int result = subtractSumOfFirstTwoAndThird(sumFirstTwo(a, b), c);
        System.out.println(result);
    }

    private static int subtractSumOfFirstTwoAndThird(int sumFirstTwo, int c) {
        return sumFirstTwo - c;
    }

    private static int sumFirstTwo(int a, int b) {
        return a + b;
    }
}
