package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class F03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil((double) numPeople / capacity);
        System.out.println(courses);
    }
}
