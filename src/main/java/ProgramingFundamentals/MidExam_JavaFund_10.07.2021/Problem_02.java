import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> elements = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            String command = input.split("\\s+")[0];
            int value = Integer.parseInt(input.split("\\s+")[1]);
            int index = elements.indexOf(value);
            switch (command) {
                case "Add":
                    elements.add(value);
                    break;
                case "Remove":
                    elements.remove(index);
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(input.split("\\s+")[2]);
                    elements.set(index, replacement);
                    break;
                case "Collapse":
                    elements.removeIf(element -> element < value);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(elements.toString().replaceAll("[\\[\\],]",""));
    }
}
