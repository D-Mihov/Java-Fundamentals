package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!input.get(0).equals("end")) {
            switch (input.get(0)) {
                case "Add":
                    addNumberToList(numbers, Integer.parseInt(input.get(1)));
                    break;
                case "Remove":
                    removeNumberFromList(numbers, Integer.parseInt(input.get(1)));
                    break;
                case "RemoveAt":
                    removeNumberAtGivenIndex(numbers, Integer.parseInt(input.get(1)));
                    break;
                case "Insert":
                    insertNumberAtGivenIndex(numbers, Integer.parseInt(input.get(1)), Integer.parseInt(input.get(2)));
                    break;
            }
            input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        for (int number :
                numbers) {
            System.out.printf("%d ", number);
        }
    }

    private static void insertNumberAtGivenIndex(List<Integer> numbers, int num, int index) {
        numbers.add(index, num);
    }

    private static void removeNumberAtGivenIndex(List<Integer> numbers, int index) {
        numbers.remove(index);
    }

    private static void removeNumberFromList(List<Integer> numbers, int num) {
        numbers.remove(Integer.valueOf(num));
    }

    private static void addNumberToList(List<Integer> numbers, int num) {
        numbers.add(num);
    }
}
