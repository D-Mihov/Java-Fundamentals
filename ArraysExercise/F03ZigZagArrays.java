package ArraysExercise;

import java.util.Scanner;

public class F03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];
        String[] helper = new String[2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            helper = scanner.nextLine().split(" ");
            if (count == 0) {
                arr1[i] = helper[0];
                arr2[i] = helper[1];
                count = 1;
            } else {
                arr1[i] = helper[1];
                arr2[i] = helper[0];
                count = 0;
            }
        }
        System.out.println(String.join(" ", arr1));
        System.out.println(String.join(" ", arr2));
    }
}
