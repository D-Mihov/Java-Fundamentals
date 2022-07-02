package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (sumAdjacentEqualNumbers(numbers, i)) {
                i = -1;
            }
        }

        String output = listToString(numbers);

        System.out.println(output);
    }

    private static String listToString(List<Double> items) {
        String output = "";
        for (double item : items) {
            output += (new DecimalFormat("0.#").format(item) + " ");
        }
        return output;
    }

    private static boolean sumAdjacentEqualNumbers(List<Double> numbers, int index) {
        if (numbers.get(index).equals(numbers.get(index + 1))) {
            numbers.set(index, numbers.get(index) + numbers.get(index + 1));
            numbers.remove(index + 1);
            return true;
        }
        return false;
    }
}
