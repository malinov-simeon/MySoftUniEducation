
package p01_WorkingWithAbstraction.greedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static long wealthGathered = 0;
    private static long gems = 0;
    private static long cash = 0;
    private static long gold = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long entrance = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        Map<String, Map<String , Long>> bag = new LinkedHashMap<>();

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long amount = Long.parseLong(safe[i + 1]);

            String type = "";

            if (name.length() == 3) {
                type = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                type = "Gem";
            } else if (name.equalsIgnoreCase("gold")) {
                type = "Gold";
            }

            if (entrance < wealthGathered) {
                continue;
            } else if (type.equals("")) {
                continue;
            }

            switch (type) {
                case "Gem":
                    long l = gems + amount;
                    if (l <= gold) {
                        bag.putIfAbsent("Gem", new LinkedHashMap<>());
                        bag.get("Gem").putIfAbsent(name, 0L);
                        bag.get("Gem").put(name, bag.get("Gem").get(name) + amount);
                        gems += amount;
                        wealthGathered += amount;
                    }
                    break;
                case "Cash":
                    if (cash + amount <= gems) {
                        bag.putIfAbsent("Cash", new LinkedHashMap<>());
                        bag.get("Cash").putIfAbsent(name, 0L);
                        bag.get("Cash").put(name, bag.get("Cash").get(name) + amount);
                        cash += amount;
                        wealthGathered += amount;
                    }
                    break;
                case "Gold":
                    bag.putIfAbsent("Gold", new LinkedHashMap<>());
                    bag.get("Gold").putIfAbsent("Gold", 0L);
                    bag.get("Gold").put("Gold", bag.get("Gold").get("Gold") + amount);
                    gold += amount;
                    wealthGathered += amount;
                    break;
            }
        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", x.getKey(), sumValues);

            x.getValue().entrySet().stream()
                    .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
        }


    }
}