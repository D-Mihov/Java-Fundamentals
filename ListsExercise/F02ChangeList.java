package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!input.get(0).equals("end")) {
            if (input.get(0).equals("Delete")) {
                deleteElementsEqualToGiven(numbers, Integer.parseInt(input.get(1)));
            } else if (input.get(0).equals("Insert")) {
                insertElementAtGivenPosition(numbers, Integer.parseInt(input.get(1)), Integer.parseInt(input.get(2)));
            }
            input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        for (int number :
                numbers) {
            System.out.printf("%d ", number);
        }
    }

    private static void insertElementAtGivenPosition(List<Integer> numbers, int element, int position) {
        numbers.add(position, element);
    }

    private static void deleteElementsEqualToGiven(List<Integer> numbers, int num) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == num) {
                numbers.remove(i);
                i = -1;
            }
        }
    }
}
