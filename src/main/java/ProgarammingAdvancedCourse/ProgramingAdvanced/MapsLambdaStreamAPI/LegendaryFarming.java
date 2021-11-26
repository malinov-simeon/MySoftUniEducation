import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , Integer> materials = new TreeMap<>();
        materials.put("motes", 0);
        materials.put("shards", 0);
        materials.put("fragments", 0);

        Map<String , Integer> junk = new TreeMap<>();

        while (true) {
            boolean legendaryFound = false;
            List<String> input = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .collect(Collectors.toList());
            while (!input.isEmpty()) {
                int quantity = Integer.parseInt(input.remove(0));
                String material = input.remove(0).toLowerCase();
                if (materials.containsKey(material)) {
                    materials.put(material, materials.get(material) + quantity);
                } else {
                    if (junk.containsKey(material)) {
                        junk.put(material, junk.get(material) + quantity);
                    } else {
                        junk.put(material, quantity);
                    }
                }
                if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    legendaryFound = true;
                    break;
                } else if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    legendaryFound = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    legendaryFound = true;
                    break;
                }
            }
            if (legendaryFound) {
                break;
            }
        }
        materials.entrySet().stream()
                .sorted(Collections.reverseOrder(comparingByValue()))
                .forEach(m -> System.out.println(m.getKey() + ": " + m.getValue()));

        junk.entrySet().forEach(j -> System.out.println(j.getKey() + ": " + j.getValue()));
    }
}
