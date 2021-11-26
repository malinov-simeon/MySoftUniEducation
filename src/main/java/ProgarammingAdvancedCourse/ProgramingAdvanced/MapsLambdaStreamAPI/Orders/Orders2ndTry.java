package Orders;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders2ndTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String ,Map<Double, Integer>> products = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {
            String[] split = input.split("\\s+");
            String productName = split[0];
            double price = Double.parseDouble(split[1]);
            int quantity = Integer.parseInt(split[2]);

            if (products.containsKey(productName)) {

            } else {
                Map<Double, Integer> priceQuantity = new HashMap<>();
                priceQuantity.put(price, quantity);
                products.put(productName, priceQuantity);
            }
        }
    }
}
