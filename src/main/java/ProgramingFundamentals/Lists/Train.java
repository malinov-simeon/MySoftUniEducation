import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String [] commandArray = command.split(" ");

            if (commandArray[0].equals("Add")) {
                wagons.add(Integer.parseInt(commandArray[1]));
            } else {
                for (int index = 0; index < wagons.size(); index++) {
                    if (wagons.get(index) + Integer.parseInt(commandArray[0]) <= capacity) {
                        wagons.set(index, wagons.get(index) + Integer.parseInt(commandArray[0]));
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
