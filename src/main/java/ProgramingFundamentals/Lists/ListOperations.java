import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String [] commandArray = command.split("\\s+");

            switch (commandArray[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(commandArray[1]));
                    break;
                case "Remove":
                    if (isValid(Integer.parseInt(commandArray[1]), numbers.size())) {
                        numbers.remove(Integer.parseInt(commandArray[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Insert":
                    if (isValid(Integer.parseInt(commandArray[2]), numbers.size())) {
                        numbers.add(Integer.parseInt(commandArray[2]), Integer.parseInt(commandArray[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (commandArray[1].equals("left")) {
                        moveLeft(numbers, Integer.parseInt(commandArray[2]));
                    } else if (commandArray[1].equals("right")) {
                        moveRight(numbers, Integer.parseInt(commandArray[2]));
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        numbers.forEach(number -> System.out.print(number + " "));

    }

    private static void moveRight(List<Integer> numbers, int rotations) {
        for (int i = 0; i < rotations; i++) {
            numbers.add(0, numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
        }
    }

    private static void moveLeft(List<Integer> numbers, int rotations) {
        for (int i = 0; i < rotations; i++) {
            numbers.add(numbers.size(), numbers.get(0));
            numbers.remove(0);
        }
    }

    public static boolean isValid(int index, int size) {
        return index < size && index >= 0;
    }
}
