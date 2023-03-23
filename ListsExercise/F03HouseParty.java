package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> input = new ArrayList<>();
        List<String> guestList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            trackGuests(input, guestList);
        }

        for (String name :
                guestList) {
            System.out.println(name);
        }
    }

    private static void trackGuests(List<String> input, List<String> guestList) {
        if (input.get(2).equals("going!")) {
            if (guestList.contains(input.get(0))) {
                System.out.printf("%s is already in the list!\n", input.get(0));
            } else {
                guestList.add(input.get(0));
            }
        } else if (input.get(2).equals("not")) {
            if (!guestList.contains(input.get(0))) {
                System.out.printf("%s is not in the list!\n", input.get(0));
            } else {
                guestList.remove(input.get(0));
            }
        }
    }

}
