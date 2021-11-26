package p03_Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        List<String> productsNamesList = new ArrayList<>();
        this.products.forEach(product -> productsNamesList.add(product.getName()));
        String productNames = String.join(", ", productsNamesList);

        if (productNames.equals("")) {
            return name + " - Nothing bought";
        }
        return name + " - " + String.join(", ", productsNamesList);
    }

    public void buyProduct(Product product) {
        if (product.getCost() <= this.money) {
            money -= product.getCost();
            products.add(product);
            System.out.println(this.name + " bought " + product.getName());
        } else {
            System.out.println(this.name + " can't afford " + product.getName());
        }
    }
}
