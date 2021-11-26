package p03_Encapsulation.ShoppingSpree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] peopleInput = scanner.nextLine().split(";");
        Map<String , Person> people = new LinkedHashMap<>();

        for (int i = 0; i < peopleInput.length; i++) {
            String[] currentPerson = peopleInput[i].split("=");
            String name = currentPerson[0];
            double money = Double.parseDouble(currentPerson[1]);
            try {
                Person person = new Person(name, money);
                people.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] productsInput = scanner.nextLine().split(";");
        Map<String , Product> products = new HashMap<>();

        for (int i = 0; i < productsInput.length; i++) {
            String [] currentProduct = productsInput[i].split("=");
            String name = currentProduct[0];
            double cost = Double.parseDouble(currentProduct[1]);

            try {
                Product product = new Product(name, cost);
                products.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] commandSplit = command.split("\\s+");
            String personName = commandSplit[0];
            String productName = commandSplit[1];

            Person person = people.get(personName);
            Product product = products.get(productName);

            person.buyProduct(product);
            command = scanner.nextLine();
        }

        for (Person person : people.values()) {
            System.out.println(person);
        }
    }
}
