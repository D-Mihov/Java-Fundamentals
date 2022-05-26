package ArraysExercise;

import java.util.Scanner;

public class F02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements1 = scanner.nextLine().split(" ");
        String[] elements2 = scanner.nextLine().split(" ");
        for (String value : elements2) {
            for (String s : elements1) {
                if (value.equals(s)) {
                    System.out.printf("%s ", s);
                }
            }
        }
    }
}
