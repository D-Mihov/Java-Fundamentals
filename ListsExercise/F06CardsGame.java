package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum;

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {
            compareCards(firstDeck, secondDeck);
        }

        if (!firstDeck.isEmpty()) {
            sum = sumOfList(firstDeck);
            System.out.printf("First player wins! Sum: %d%n", sum);
        } else if (!secondDeck.isEmpty()) {
            sum = sumOfList(secondDeck);
            System.out.printf("Second player wins! Sum: %d%n", sum);
        }
    }

    private static int sumOfList(List<Integer> list) {
        int sum = 0;
        for (int number :
                list) {
            sum += number;
        }

        return sum;
    }

    private static void compareCards(List<Integer> firstDeck, List<Integer> secondDeck) {
        if (firstDeck.get(0) > secondDeck.get(0)) {
            firstDeck.add(firstDeck.get(0));
            firstDeck.add(secondDeck.get(0));
            firstDeck.remove(0);
            secondDeck.remove(0);
        } else if (firstDeck.get(0) < secondDeck.get(0)) {
            secondDeck.add(secondDeck.get(0));
            secondDeck.add(firstDeck.get(0));
            secondDeck.remove(0);
            firstDeck.remove(0);
        } else {
            firstDeck.remove(0);
            secondDeck.remove(0);
        }
    }
}
