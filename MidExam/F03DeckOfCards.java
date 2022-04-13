package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F03DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> deck = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(", ");
            switch (command[0]) {
                case "Add":
                    if (!deck.contains(command[1])) {
                        deck.add(command[1]);
                        System.out.println("Card successfully added");
                    } else {
                        System.out.println("Card is already in the deck");
                    }
                    break;
                case "Remove":
                    if (deck.contains(command[1])) {
                        deck.remove(command[1]);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    if (Integer.parseInt(command[1]) < deck.size() && Integer.parseInt(command[1]) >= 0) {
                        deck.remove(Integer.parseInt(command[1]));
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    if (Integer.parseInt(command[1]) < deck.size() && Integer.parseInt(command[1]) >= 0) {
                        if (!deck.contains(command[2])) {
                            deck.add(Integer.parseInt(command[1]), command[2]);
                            System.out.println("Card successfully added");
                        } else {
                            System.out.println("Card is already added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }

        for (int i = 0; i < deck.size(); i++) {
            System.out.printf("%s", deck.get(i));
            if (i < deck.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
