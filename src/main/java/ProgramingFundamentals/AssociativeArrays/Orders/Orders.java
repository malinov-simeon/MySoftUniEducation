package Orders;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Product> products = new ArrayList<>();

        while (!input.equals("buy")) {
            String name = input.split("\\s+")[0];
            double price = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);

            boolean containsProduct = false;
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    containsProduct = true;
                    product.setQuantity(product.getQuantity() + quantity);
                    product.setPrice(price);
                }
            }
            if (!containsProduct) {
                Product product = new Product(name, price, quantity);
                products.add(product);
            }
            input = scanner.nextLine();
        }
        for (Product product : products) {
            double totalCost = product.getQuantity() * product.getPrice();

            System.out.printf("%s -> %.2f%n", product.getName(), totalCost);
        }
    }

    public static class Product {
        String name;
        double price;
        int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public  double getPrice() {
            return price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
