package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F02TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(">>")).collect(Collectors.toList());
        double tax = 0;
        double taxForEachCar = 0;
        for (int i = 0; i < input.size(); i++) {
            String[] elements = input.get(i).split(" ");
            int years = Integer.parseInt(elements[1]);
            int km = Integer.parseInt(elements[2]);
            switch (elements[0]) {
                case "family":
                    taxForEachCar = (int) ((double) km / (double) 3000) * 12 + (50 - years * 5);
                    System.out.printf("A %s car will pay %.2f euros in taxes.\n", elements[0], taxForEachCar);
                    break;
                case "heavyDuty":
                    taxForEachCar = (int) ((double) km / (double) 9000) * 14 + (80 - years * 8);
                    System.out.printf("A %s car will pay %.2f euros in taxes.\n", elements[0], taxForEachCar);
                    break;
                case "sports":
                    taxForEachCar = (int) ((double) km / (double) 2000) * 18 + (100 - years * 9);
                    System.out.printf("A %s car will pay %.2f euros in taxes.\n", elements[0], taxForEachCar);
                    break;
                default:
                    System.out.println("Invalid car type.");
                    break;
            }
            tax += taxForEachCar;
            taxForEachCar = 0;
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.\n", tax);
    }
}
