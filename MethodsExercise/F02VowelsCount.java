package MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class F02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        vowelsCount(string);
    }

    private static void vowelsCount(String string) {
        string = string.toLowerCase(Locale.ROOT);
        int vowelsCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'o' || string.charAt(i) == 'i' || string.charAt(i) == 'u' || string.charAt(i) == 'e' ||
                    string.charAt(i) == 'y') {
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }
}
