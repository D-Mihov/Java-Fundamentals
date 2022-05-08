package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class F10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyAmount = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        int freeBelts = Math.round(studentsCount / 6);
        double costs = lightsaberPrice * (studentsCount + Math.ceil(studentsCount * 0.1)) + robePrice * studentsCount + beltPrice * (studentsCount - freeBelts);
        if (costs <= moneyAmount) {
            System.out.printf("The money is enough - it would cost %.2flv.", costs);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", costs - moneyAmount);
        }
    }
}
