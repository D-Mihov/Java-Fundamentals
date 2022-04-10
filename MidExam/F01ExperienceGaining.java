package MidExam;

import java.util.Scanner;

public class F01ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededExperience = Double.parseDouble(scanner.nextLine());
        int battles = Integer.parseInt(scanner.nextLine());
        double experiencePerBattle;
        double currentExp = 0;
        int count = 0;

        for (int i = 1; i <= battles; i++) {
            experiencePerBattle = Double.parseDouble(scanner.nextLine());
            if (i % 15 == 0) {
                currentExp += experiencePerBattle + experiencePerBattle * 0.05;
                currentExp += experiencePerBattle + experiencePerBattle * 0.15;
                currentExp += experiencePerBattle - experiencePerBattle * 0.1;
            } else if (i % 3 == 0) {
                currentExp += experiencePerBattle + experiencePerBattle * 0.15;
            } else if (i % 5 == 0) {
                currentExp += experiencePerBattle - experiencePerBattle * 0.1;
            } else {
                currentExp += experiencePerBattle;
            }
            count++;
            if (currentExp >= neededExperience){
                break;
            }
        }

        if (currentExp >= neededExperience) {
            System.out.printf("Player successfully collected his needed experience for %d battles.\n", count);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.\n", neededExperience - currentExp);
        }
    }
}
