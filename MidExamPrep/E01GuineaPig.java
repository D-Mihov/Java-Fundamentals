package MidExamPrep;

import java.util.Scanner;

public class E01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodQuantity = Double.parseDouble(scanner.nextLine());
        double hayQuantity = Double.parseDouble(scanner.nextLine());
        double coverQuantity = Double.parseDouble(scanner.nextLine());
        double GuineasWeight = Double.parseDouble(scanner.nextLine());
        foodQuantity *= 1000;
        hayQuantity *= 1000;
        coverQuantity *= 1000;
        GuineasWeight *= 1000;
        boolean isValid = false;
        int days = 1;

        while (days <= 30) {
            foodQuantity -= 300;

            if (days % 2 == 0) {
                hayQuantity -= (foodQuantity * 5) / 100;
            }

            if (days % 3 == 0) {
                coverQuantity -= GuineasWeight * 1 / 3;
            }
            if (foodQuantity < 0 || hayQuantity < 0 || coverQuantity < 0) {
                System.out.println("Merry must go to the pet store!");
                isValid = true;
                break;
            }
            days++;
        }

        if (!isValid) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodQuantity/1000,
                    hayQuantity/1000, coverQuantity/1000);
        }
    }
}
