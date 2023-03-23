package MidExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class F03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] neighbourhood = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int index = 0;

        while (!command.equals("Love!")) {
            String[] array = command.split(" ");
            int jumpLength = Integer.parseInt(array[1]);
            index += jumpLength;
            if (index > neighbourhood.length - 1) {
                index = 0;
            }
            neighbourhood[index] -= 2;

            if (neighbourhood[index] == 0) {
                System.out.printf("Place %d has Valentine's day.\n", index);
            } else if (neighbourhood[index] < 0) {
                System.out.printf("Place %d already had Valentine's day.\n", index);
            }
            command = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.\n", index);
        int count = 0;
        for (int number :
                neighbourhood) {
            if (number <= 0) {
                count++;
            }
        }
        if (count == neighbourhood.length) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.\n", neighbourhood.length - count);
        }
    }
}
