package MethodsExercise;

import java.util.Scanner;

public class F07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printingNxNMatrix(number);
    }

    private static void printingNxNMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }
}
