import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inventory = Arrays
                .stream(scanner.nextLine().split(",+\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String [] commandArray = command.split("\\s+-+\\s+");
            String operation = commandArray[0];
            String item = commandArray[1];
            switch (operation) {
                case "Renew":
                    if (inventory.contains(item)) {
                        inventory.remove(item);
                        inventory.add(item);
                    }
                    break;
                case "Drop":
                    inventory.remove(item);
                    break;
                case "Collect":
                    if (!inventory.contains(item)) {
                        inventory.add(item);
                    }
                    break;
                case "Combine Items":
                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];
                    if (inventory.contains(oldItem)) {
                        inventory.add(inventory.indexOf(oldItem) + 1, newItem);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventory));
    }
}
