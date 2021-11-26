import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        int count = 0;

        while (!command.equals("End")) {
            int index = Integer.parseInt(command);

            //проверяваме дали е валиден индексът
            if (index < targets.length) {
                int value = targets[index];
                targets[index] = -1;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] != -1) {
                        if (targets[i] > value) {
                            targets[i] -= value;
                        } else {
                            targets[i] += value;
                        }
                    }
                }
                count++;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",count);
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}
