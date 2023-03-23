package MidExamPrep;

import java.util.Scanner;

public class F01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        int bonus;
        int maxBonus = 0;
        int maxAttendance = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int attendanceOfEachStudent = Integer.parseInt(scanner.nextLine());
            bonus = bonusCalculation(numberOfLectures, attendanceOfEachStudent, additionalBonus);
            if (bonus > maxBonus) {
                maxBonus = bonus;
                maxAttendance = attendanceOfEachStudent;
            }
        }

        System.out.printf("Max Bonus: %d.\n", maxBonus);
        System.out.printf("The student has attended %d lectures.\n", maxAttendance);
    }

    private static int bonusCalculation(int numberOfLectures, int attendanceOfEachStudent, int additionalBonus) {
        return (int) Math.ceil((double) attendanceOfEachStudent / (double) numberOfLectures * (5 + additionalBonus));
    }
}
