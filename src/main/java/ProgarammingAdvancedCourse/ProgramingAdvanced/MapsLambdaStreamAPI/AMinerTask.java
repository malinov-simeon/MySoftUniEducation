import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String material = scanner.nextLine();
        Map<String , Integer> materialsQuantity = new LinkedHashMap<>();

        while (!material.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (materialsQuantity.containsKey(material)) {
                materialsQuantity.put(material, materialsQuantity.get(material) + quantity);
            } else {
                materialsQuantity.put(material, quantity);
            }
            material = scanner.nextLine();
        }
        materialsQuantity.entrySet()
                .forEach(mat -> System.out.println(mat.getKey() + " -> " + mat.getValue()));
    }
}
