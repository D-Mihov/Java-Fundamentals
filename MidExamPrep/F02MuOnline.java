package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class F02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        int health = 100;
        int bitcoins = 0;
        boolean flag = true;

        for (int i = 0; i < input.size(); i++) {
            String[] room = input.get(i).split(" ");
            switch (room[0]) {
                case "potion":
                    health = healHero(health, Integer.parseInt(room[1]));
                    System.out.printf("Current health: %d hp.\n", health);
                    break;
                case "chest":
                    bitcoins += Integer.parseInt(room[1]);
                    System.out.printf("You found %d bitcoins.\n", Integer.parseInt(room[1]));
                    break;
                default:
                    health -= Integer.parseInt(room[1]);
                    if (health > 0) {
                        System.out.printf("You slayed %s.\n", room[0]);
                    } else {
                        System.out.printf("You died! Killed by %s.\n", room[0]);
                        flag = false;
                    }
                    break;
            }
            if (!flag) {
                System.out.printf("Best room: %d\n", i + 1);
                break;
            }
        }

        if (flag) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n", bitcoins);
            System.out.printf("Health: %d\n", health);
        }
    }

    private static int healHero(int health, int bonusHealth) {
        if (health + bonusHealth > 100) {
            int healed = 100 - health;
            health = 100;
            System.out.printf("You healed for %d hp.\n", healed);
        } else {
            health += bonusHealth;
            System.out.printf("You healed for %d hp.\n", bonusHealth);
        }
        return health;
    }
}
