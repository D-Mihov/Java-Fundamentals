package ArraysExercise;

import java.util.Scanner;

public class F07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int[] array = new int[arr.length];
        int number;
        int count = 0;
        int max = 0;
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < array.length; i++) {
            number = array[i];
            count++;
            if (i != array.length - 1) {
                if (array[i] == array[i + 1]) {
                    continue;
                }
            }
            if (count > max) {
                maxNumber = number;
                max = count;
            }
            count = 0;
        }

        for (int i = 0; i < max; i++) {
            System.out.printf("%d ", maxNumber);
        }
        System.out.println();
    }
}
