import com.sun.source.tree.Tree;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materials = new TreeMap<>();
        String input = scanner.nextLine();
        String[] inputArray = input.split("\\s+");
        while (true) {
            for (int i = 1; i < inputArray.length; i += 2) {
                int value = Integer.parseInt(inputArray[i - 1]);
                String key = inputArray[i];

                if (materials.containsKey(key)) {
                    int oldValue = materials.get(key);
                    materials.put(key, oldValue + value);
                } else {
                    materials.put(key, value);
                }

                int decreaseValue = 0;
                if (materials.get("Shards") >= 250) {
                    decreaseValue = materials.get("Shards") - 250;

                    materials.put("Shards", decreaseValue);

                    System.out.println("Shadowmourne obtained!");
                } else if (materials.get("Fragments") >= 250) {
                    decreaseValue = materials.get("Fragments") - 250;
                } else if (materials.get("Motes") >= 250) {
                    decreaseValue = materials.get("Shards") - 250;
                }
            }
            input = scanner.nextLine();
            inputArray = input.split("\\s+");
        }
    }
}
