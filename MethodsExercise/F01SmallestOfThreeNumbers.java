package MethodsExercise;

import java.util.Scanner;

public class F01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        smallestNumberOfThree(a, b, c);
    }

    private static void smallestNumberOfThree(int a, int b, int c) {
        int min;
        min = Math.min(Math.min(a, b), c);
        System.out.println(min);
    }
}
