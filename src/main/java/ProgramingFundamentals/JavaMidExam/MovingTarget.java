import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split("\\s+")[0];
            int index = Integer.parseInt(input.split("\\s+")[1]);
            switch (command) {
                case "Shoot":
                    int power = Integer.parseInt(input.split("\\s+")[2]);
                    if (targets.size() > index && index >= 0) {
                        if (targets.get(index) - power <= 0) {
                            targets.remove(index);
                        } else {
                            targets.set(index, targets.get(index) - power);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(input.split("\\s+")[2]);
                    if (index < targets.size() && index >= 0) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(input.split("\\s+")[2]);
                    if (index + radius < targets.size() && index - radius >= 0) {
                        for (int i = 0; i < 2 * radius + 1; i++) {
                            targets.remove(index - radius);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() - 1) {
                System.out.print(targets.get(i));
                break;
            }
            System.out.print(targets.get(i) + "|");
        }
    }
}
