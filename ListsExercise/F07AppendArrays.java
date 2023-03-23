package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class F07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        while (!input.isEmpty()) {
            listModifyAndSublistPrint(input);
        }
        System.out.println();
    }

    private static void listModifyAndSublistPrint(List<String> input) {
        Collections.reverse(input);
        String[] array = input.get(0).split("\\s+");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(""))
                System.out.printf("%d ", Integer.parseInt(array[i]));
        }
        input.remove(0);
        Collections.reverse(input);
    }
}
