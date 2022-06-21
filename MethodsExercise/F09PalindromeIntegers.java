package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class F09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {

            boolean check = palindromeCheck(input, input.length());
            System.out.println(check);
            input = scanner.nextLine();
        }
    }

    private static boolean palindromeCheck(String input, int length) {
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
