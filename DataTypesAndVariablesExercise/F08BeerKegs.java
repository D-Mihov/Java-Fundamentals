package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class F08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String model = "";
        String biggestModel = "";
        double radius = 0.0;
        int height = 0;
        double volume = 0.0;
        double biggestVolume = 0.0;

        for (int i = 0; i < n; i++) {
            model = scanner.nextLine();
            radius = Double.parseDouble(scanner.nextLine());
            height = Integer.parseInt(scanner.nextLine());
            volume = Math.round(Math.PI * Math.pow(radius, 2) * height);
            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggestModel = model;
            }
        }
        System.out.println(biggestModel);
    }
}
