package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class F04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        if (minutes + 30 >= 60) {
            if (hours==23){
                System.out.printf("0:%02d", minutes + 30 - 60);
            }else {
                System.out.printf("%d:%02d", hours + 1, minutes + 30 - 60);
            }
        } else {
            System.out.printf("%d:%02d", hours, minutes + 30);
        }

    }
}
