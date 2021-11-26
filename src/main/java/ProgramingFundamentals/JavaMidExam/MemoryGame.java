import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sequence = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        int counter = 0;

        while (!input.equals("end")) {
            int firstIndex = Integer.parseInt(input.split("\\s+")[0]);
            int secondIndex = Integer.parseInt(input.split("\\s+")[1]);
            counter++;
            if (firstIndex == secondIndex
                    || firstIndex >= sequence.size()
                    || secondIndex >= sequence.size()
                    || firstIndex < 0
                    || secondIndex < 0) {
                String penalty = "-" + counter + "a";
                sequence.add(sequence.size() / 2, penalty);
                sequence.add(sequence.size() / 2, penalty);
                System.out.println("Invalid input! Adding additional elements to the board");
                input = scanner.nextLine();
                continue;
            }
            String firstElement = sequence.get(firstIndex);
            String secondElement = sequence.get(secondIndex);
            if (sequence.get(firstIndex).equals(sequence.get(secondIndex))) {
                System.out.printf("Congrats! You have found matching elements - %s!%n",sequence.get(firstIndex));
                sequence.remove(firstElement);
                sequence.remove(secondElement);
            } else {
                System.out.println("Try again!");
            }

            if (sequence.isEmpty()) {
                break;
            }
                input = scanner.nextLine();
        }
        if (sequence.isEmpty()) {
            System.out.printf("You have won in %d turns!", counter);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", sequence));
        }
    }
}
