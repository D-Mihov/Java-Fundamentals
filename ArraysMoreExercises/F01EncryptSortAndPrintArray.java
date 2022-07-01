package ArraysMoreExercises;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class F01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            arr[i] = stringEncrypt(input);
        }
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static int stringEncrypt(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'o' || input.charAt(i) == 'i' || input.charAt(i) == 'e' ||
                    input.charAt(i) == 'u' || input.charAt(i) == 'A' || input.charAt(i) == 'O' || input.charAt(i) == 'I' || input.charAt(i) == 'E' ||
                    input.charAt(i) == 'U') {
                sum += (int) input.charAt(i) * input.length();
            } else {
                sum += (int) input.charAt(i) / input.length();
            }
        }
        return sum;
    }
}
