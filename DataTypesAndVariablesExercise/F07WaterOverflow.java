package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class F07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int litters = 0;
        int tank = 0;
        for (int i = 0; i < n; i++) {
            litters = Integer.parseInt(scanner.nextLine());
            if (tank + litters <= 255) {
                tank += litters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(tank);
    }
}
