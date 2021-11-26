import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int wins = 0;

        while (initialEnergy >= 0 && !command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            if (initialEnergy >= distance) {
                initialEnergy -= distance;
                wins++;
                if (wins % 3 == 0) {
                    initialEnergy += wins;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wins, initialEnergy);
                return;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Won battles: %d. Energy left: %d", wins, initialEnergy);
    }
}
