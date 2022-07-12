package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!input.get(0).equals("end")) {
            switch (input.get(0)) {
                case "Contains":
                    checkForNumber(numbers, Integer.parseInt(input.get(1)));
                    break;
                case "Print":
                    switch (input.get(1)) {
                        case "even":
                            printEvenNumbers(numbers);
                            break;
                        case "odd":
                            printOddNumbers(numbers);
                            break;
                    }
                    break;
                case "Get":
                    printSumOfNumbers(numbers);
                    break;
                case "Filter":
                    filterList(numbers, input.get(1), Integer.parseInt(input.get(2)));
                    break;
            }
            input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
    }

    private static void filterList(List<Integer> numbers, String s, int num) {
        switch (s) {
            case ">":
                for (int number :
                        numbers) {
                    if (number > num) {
                        System.out.printf("%d ", number);
                    }
                }
                System.out.println();
                break;
            case "<":
                for (int number :
                        numbers) {
                    if (number < num) {
                        System.out.printf("%d ", number);
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int number :
                        numbers) {
                    if (number >= num) {
                        System.out.printf("%d ", number);
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int number :
                        numbers) {
                    if (number <= num) {
                        System.out.printf("%d ", number);
                    }
                }
                System.out.println();
                break;
        }
    }

    private static void printSumOfNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int number :
                numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        for (int number :
                numbers) {
            if (number % 2 != 0) {
                System.out.printf("%d ", number);
            }
        }
        System.out.println();
    }


    private static void printEvenNumbers(List<Integer> numbers) {
        for (int number :
                numbers) {
            if (number % 2 == 0) {
                System.out.printf("%d ", number);
            }
        }
        System.out.println();
    }

    private static void checkForNumber(List<Integer> numbers, int num) {
        if (numbers.contains(num)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}
