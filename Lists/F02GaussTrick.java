package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < Math.ceil((double) numbers.size() / 2); i++) {
            System.out.printf("%d ", gaussTrickSum(numbers, i));
        }
        System.out.println();
    }

    private static int gaussTrickSum(List<Integer> numbers, int index) {
        if (numbers.size() / 2 == index) {
            return numbers.get(index);
        }
        return numbers.get(index) + numbers.get(numbers.size() - index - 1);
    }
}
