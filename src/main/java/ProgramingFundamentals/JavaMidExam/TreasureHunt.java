import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> treasureChest = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            String[] inputArray = input.split("\\s+");
            String command = inputArray[0];
            switch (command) {
                case "Loot":
                    for (int i = 1; i < inputArray.length; i++) {
                        if (!treasureChest.contains(inputArray[i])) {
                            treasureChest.add(0, inputArray[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(inputArray[1]);
                    boolean indexIsValid = valid(index, treasureChest.size());
                    if (indexIsValid) {
                        treasureChest.add(treasureChest.remove(index));
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(inputArray[1]);
                    if (count > treasureChest.size()) {
                        count = treasureChest.size();
                    }
                    List<String> stolen = new ArrayList<>();
                    for (int i = 1; i <= count; i++) {
                        stolen.add(treasureChest.get(treasureChest.size() - i));
                    }
                    Collections.reverse(stolen);
                    System.out.println(stolen.toString().replaceAll("[\\[\\]]", ""));
                    treasureChest.removeAll(stolen);
                    break;
            }
            input = scanner.nextLine();
        }

        double sum = 0;
        for (String s : treasureChest) {
            int number = s.length();
            sum += number;
        }

        double averageGain = sum / treasureChest.size();

        if (treasureChest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        }
    }

    private static boolean valid(int index, int size) {
        return index < size && index >= 0;
    }
}
