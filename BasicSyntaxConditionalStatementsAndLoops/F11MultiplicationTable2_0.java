package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class F11MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        if (multiplier <= 10) {
            for (int i = multiplier; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", num, i, num * i);
            }
        } else {
            System.out.printf("%d X %d = %d\n", num, multiplier, num * multiplier);
        }
    }
}
