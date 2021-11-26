import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] commandArray = command.split("\\s+");

            if (commandArray[0].equals("merge")) {
                StringBuilder mergedText = new StringBuilder();
                int startIndex = Integer.parseInt(commandArray[1]);
                int endIndex = Integer.parseInt(commandArray[2]);

                if (endIndex > input.size() - 1) {
                    endIndex = input.size() - 1;
                }
                if (startIndex < 0 || startIndex >= endIndex) {
                    startIndex = 0;
                }
                for (int index = startIndex; index <= endIndex; index++) {
                    mergedText.append(input.get(index));
                    input.set(index, " ");
                }
                input.add(startIndex, String.valueOf(mergedText));
                input.removeAll(Collections.singleton(" "));

            } else if (commandArray[0].equals("divide")) {
                int index = Integer.parseInt(commandArray[1]);
                int partitions = Integer.parseInt(commandArray[2]);

                String object = input.remove(index);
                int size = object.length() / partitions;
                int start = 0;

                for (int i = 1; i < partitions; i++) {
                    input.add(index, object.substring(start, start + size));
                    index++;
                    start += size;
                }
                input.add(index, object.substring(start));

            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(" ", input));
    }
}
