package ArraysExercise;

import java.util.Scanner;

public class F08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int[] array = new int[arr.length];
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    System.out.printf("%d %d", array[i], array[j]);
                    System.out.println();
                }
            }
        }
    }
}
