import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays
                .stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String command = input.split("\\s+")[0];
            String item = input.split("\\s+")[1];
            switch (command) {
                case "Urgent":
                    if (!list.contains(item)) {
                        list.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    list.remove(item);
                    break;
                case "Correct":
                    if (list.contains(item)) {
                        int index = list.indexOf(item);
                        String newItem = input.split("\\s+")[2];
                        list.set(index, newItem);
                    }
                    break;
                case "Rearrange":
                    if (list.contains(item)) {
                        list.remove(item);
                        list.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String .join(", ", list));
    }
}
