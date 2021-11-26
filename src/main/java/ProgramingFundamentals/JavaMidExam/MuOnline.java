import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rooms = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;
        boolean dead = false;

        for (int i = 0; i < rooms.length; i++) {
            String room = rooms[i];
            String[] roomArray = room.split("\\s+");

            switch (roomArray[0]) {
                case "potion":
                    int healedAmount = Integer.parseInt(roomArray[1]);
                    if (health + healedAmount > 100) {
                        healedAmount = 100 - health;
                        health = 100;
                    } else {
                        health += healedAmount;
                    }
                    System.out.printf("You healed for %d hp.%n" +
                            "Current health: %d hp.%n", healedAmount, health);
                    break;
                case "chest":
                    int bitcoinsFound = Integer.parseInt(roomArray[1]);
                    bitcoins += bitcoinsFound;
                    System.out.printf("You found %d bitcoins.%n", bitcoinsFound);
                    break;
                default:
                    String monster = roomArray[0];
                    int damage = Integer.parseInt(roomArray[1]);
                    if (health > damage) {
                        health -= damage;
                        System.out.printf("You slayed %s.%n", monster);
                    } else {
                        System.out.printf("You died! Killed by %s.%n" +
                                "Best room: %d", monster, i + 1);
                        dead = true;
                    }
                    break;
            }
            if (dead) {
                break;
            }
        }
        if (!dead) {
            System.out.printf("You've made it!%n" +
                    "Bitcoins: %d%n" +
                    "Health: %d", bitcoins, health);
        }
    }
}
