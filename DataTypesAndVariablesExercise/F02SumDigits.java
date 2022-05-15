package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class F02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int num = Integer.parseInt(number);
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
