package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (numbers.contains(input.get(0))) {
            deleteLeftSideAtBomb(numbers, input);
            deleteRightSideAtBomb(numbers, input);
            deleteBomb(numbers, input);
        }

        sum = sumOfList(numbers);
        System.out.println(sum);
    }

    private static void deleteBomb(List<Integer> numbers, List<Integer> input) {
        numbers.remove(input.get(0));
    }

    private static int sumOfList(List<Integer> numbers) {
        int sum = 0;
        for (int number :
                numbers) {
            sum += number;
        }
        return sum;
    }

    private static void deleteRightSideAtBomb(List<Integer> numbers, List<Integer> input) {
        int i = 0;
        while (i < input.get(1)) {
            if (numbers.indexOf(input.get(0)) + input.get(1) - i <= numbers.size() - 1) {
                numbers.remove(numbers.indexOf(input.get(0)) + 1);
            }
            i++;
        }
    }

    private static void deleteLeftSideAtBomb(List<Integer> numbers, List<Integer> input) {
        int i = 0;
        while (i < input.get(1)) {
            if (numbers.indexOf(input.get(0)) - input.get(1) + i >= 0) {
                numbers.remove(numbers.indexOf(input.get(0)) - 1);
            }
            i++;
        }
    }
}
