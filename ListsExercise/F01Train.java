package ListsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("end")) {
            if (input.length > 1) {
                addingPassengers(wagons, input);
            } else {
                fittingPassengers(wagons, input, maxCapacity);
            }
            input = scanner.nextLine().split(" ");
        }
        for (int wagon : wagons) {
            System.out.printf("%d ", wagon);
        }
    }

    private static void fittingPassengers(List<Integer> wagons, String[] input, int maxCapacity) {
        int passengers = Integer.parseInt(input[0]);
        for (int i = 0; i < wagons.size(); i++) {
            if (wagons.get(i) + passengers <= maxCapacity) {
                wagons.set(i, wagons.get(i) + passengers);
                break;
            }
        }
    }

    private static void addingPassengers(List<Integer> wagons, String[] input) {
        wagons.add(Integer.parseInt(input[1]));
    }
}
