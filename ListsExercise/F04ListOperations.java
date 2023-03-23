package ListsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        while (!input.get(0).equals("End")) {
            switch (input.get(0)) {
                case "Add":
                    addNumberToList(numbers, Integer.parseInt(input.get(1)));
                    break;
                case "Insert":
                    if (Integer.parseInt(input.get(2)) <= numbers.size() - 1 && Integer.parseInt(input.get(2)) >= 0) {
                        insertNumberAtGivenIndex(numbers, Integer.parseInt(input.get(1)), Integer.parseInt(input.get(2)));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(input.get(1)) <= numbers.size() - 1 && Integer.parseInt(input.get(1)) >= 0) {
                        removeNumberFromIndex(numbers, Integer.parseInt(input.get(1)));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (input.get(1).equals("left")) {
                        shiftElementsInListLeft(numbers, Integer.parseInt(input.get(2)));
                    } else if (input.get(1).equals("right")) {
                        shiftElementsInListRights(numbers, Integer.parseInt(input.get(2)));
                    }
                    break;
            }
            input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }

        for (int number :
                numbers) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }

    private static void shiftElementsInListRights(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int lastNumber = numbers.get(numbers.size() - 1);
            numbers.remove(numbers.size() - 1);
            Collections.reverse(numbers);
            numbers.add(lastNumber);
            Collections.reverse(numbers);
        }
    }

    private static void shiftElementsInListLeft(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int firstNumber = numbers.get(0);
            numbers.remove(0);
            numbers.add(firstNumber);
        }
    }

    private static void removeNumberFromIndex(List<Integer> numbers, int index) {
        numbers.remove(index);
    }

    private static void insertNumberAtGivenIndex(List<Integer> numbers, int num, int index) {
        numbers.add(index, num);
    }

    private static void addNumberToList(List<Integer> numbers, int num) {
        numbers.add(num);
    }
}
