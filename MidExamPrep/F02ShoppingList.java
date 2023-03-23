package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] arr = command.split(" ");
            switch (arr[0]) {
                case "Urgent":
                    addItemAtTheStart(input, arr[1]);
                    break;
                case "Unnecessary":
                    removeItemByName(input, arr[1]);
                    break;
                case "Correct":
                    correctAnItem(input, arr[1], arr[2]);
                    break;
                case "Rearrange":
                    rearrangeAnItem(input, arr[1]);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", input));
    }

    private static void rearrangeAnItem(List<String> input, String s) {
        if (input.contains(s)){
            input.remove(s);
            input.add(s);
        }
    }

    private static void correctAnItem(List<String> input, String s, String s1) {
        if (input.contains(s)) {
            input.set(input.indexOf(s), s1);
        }
    }

    private static void removeItemByName(List<String> input, String s) {
        if (input.contains(s)){
            input.remove(s);
        }
    }

    private static void addItemAtTheStart(List<String> input, String s) {
        if (!input.contains(s)) {
            input.add(0, s);
        }
    }
}
