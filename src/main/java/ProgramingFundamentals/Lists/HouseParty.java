import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> namesList = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(" ");
            boolean notInTheList = true;

            if (command[2].equals("going!")) {
                for (String name : namesList) {
                    if (command[0].equals(name)) {
                        System.out.printf("%s is already in the list!%n", command[0]);
                        notInTheList = false;
                        break;
                    }
                }
                if (notInTheList) {
                    namesList.add(command[0]);
                }
            } else {
                for (String name : namesList) {
                    if (command[0].equals(name)) {
                        namesList.remove(command[0]);
                        notInTheList = false;
                        break;
                    }
                }
                if (notInTheList) {
                    System.out.printf("%s is not in the list!%n", command[0]);
                }
            }
        }
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
