import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String [] commandArray = command.split("\\s+");
            if (commandArray[0].equals("Delete")) {

                for (int i = 0; i < integers.size(); i++) {
                    if (Integer.parseInt(commandArray[1]) == integers.get(i)) {
                        integers.remove(i);
                    }
                }
            } else if (commandArray[0].equals("Insert")) {
                integers.add(Integer.parseInt(commandArray[2]),Integer.parseInt(commandArray[1]));
            }
            command = scanner.nextLine();
        }

        integers.forEach((integer) -> System.out.print(integer + " "));

    }
}
