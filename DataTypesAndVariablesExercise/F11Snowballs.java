package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class F11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int snowballSnow = 0;
        int biggestSnowballSnow = 0;
        int snowballTime = 0;
        int biggestSnowballTime = 0;
        int snowballQuality = 0;
        int biggestSnowballQuality = 0;
        double snowballValue = 0;
        double biggestSnowballValue = 0;

        for (int i = 0; i < n; i++) {
            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());
            snowballValue = Math.pow((double) snowballSnow / snowballTime, snowballQuality);
            if (snowballValue > biggestSnowballValue) {
                biggestSnowballValue = snowballValue;
                biggestSnowballSnow = snowballSnow;
                biggestSnowballTime = snowballTime;
                biggestSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)%n", biggestSnowballSnow, biggestSnowballTime, biggestSnowballValue, biggestSnowballQuality);
    }
}
