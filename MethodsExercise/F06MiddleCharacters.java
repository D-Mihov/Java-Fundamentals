package MethodsExercise;

import java.util.Scanner;

public class F06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleCharacterPrinting(input);
    }

    private static void middleCharacterPrinting(String input) {
        if (input.length() % 2 == 0) {
            System.out.printf("%c%c%n", input.charAt(input.length() / 2 - 1), input.charAt(input.length() / 2));
        } else {
            System.out.printf("%c%n", input.charAt(input.length() / 2));
        }
    }
}
