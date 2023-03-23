package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String[] elements = command.split(" - ");
            switch (elements[0]) {
                case "Collect":
                    if (!input.contains(elements[1])) {
                        input.add(elements[1]);
                    }
                    break;
                case "Drop":
                    if (input.contains(elements[1])) {
                        input.remove(elements[1]);
                    }
                    break;
                case "Combine Items":
                    String[] items = elements[1].split(":");
                    if (input.contains(items[0])) {
                        if (input.indexOf(items[0]) + 1 == input.size()) {
                            input.add(items[1]);
                        } else {
                            input.add(input.indexOf(items[0]) + 1, items[1]);
                        }
                    }
                    break;
                case "Renew":
                    if (input.contains(elements[1])) {
                        input.remove(elements[1]);
                        input.add(elements[1]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < input.size(); i++) {
            System.out.printf("%s", input.get(i));
            if (i + 1 != input.size()) {
                System.out.print(", ");
            }
        }
    }
}
