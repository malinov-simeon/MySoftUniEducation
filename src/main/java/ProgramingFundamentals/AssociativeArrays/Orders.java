import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<Double, Integer>> orders = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String name = input.split("\\s+")[0];
            double price = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);
            orders.putIfAbsent(name, new LinkedHashMap<>());
            orders.get(name).put(price, 0);
            orders.get(name).get(price + quantity);
            input = scanner.nextLine();
        }

    }
}
