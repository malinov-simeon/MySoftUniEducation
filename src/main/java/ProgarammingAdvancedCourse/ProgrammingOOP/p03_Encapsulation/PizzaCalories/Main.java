package p03_Encapsulation.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaArray = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaArray[1];
        int numberOfToppings = Integer.parseInt(pizzaArray[2]);

        Pizza pizza = null;
        try {
            pizza = new Pizza(pizzaName, numberOfToppings);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String[] doughArray = scanner.nextLine().split("\\s+");
        String flourType = doughArray[1];
        String bakingTechnique = doughArray[2];
        double weightInGrams = Double.parseDouble(doughArray[3]);

        Dough dough = null;
        try {
            dough = new Dough(flourType, bakingTechnique, weightInGrams);
            pizza.setDough(dough);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] toppingArray = input.split("\\s+");
            String toppingType = toppingArray[1];
            double toppingWeightInGrams = Double.parseDouble(toppingArray[2]);

            Topping topping = null;
            try {
                topping = new Topping(toppingType, toppingWeightInGrams);
                pizza.addTopping(topping);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
            input = scanner.nextLine();
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
