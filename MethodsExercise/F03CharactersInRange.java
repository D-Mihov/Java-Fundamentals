package MethodsExercise;

import java.util.Scanner;

public class F03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        printingCharactersInRange(first, second);
    }

    private static void printingCharactersInRange(char first, char second) {
        int start = Math.min((int)first,(int)second);
        int end = Math.max((int)first, (int)second);
        for (int i = start + 1; i < end; i++) {
            System.out.printf("%c ", i);
        }
        System.out.println();
    }
}
