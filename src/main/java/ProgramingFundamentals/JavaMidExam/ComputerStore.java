import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPrice = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                totalPrice += price;
            }
            input = scanner.nextLine();
        }
        if (totalPrice <= 0) {
            System.out.println("Invalid order!");
            return;
        }
        double taxes = totalPrice * 0.2;
        double totalPriceWithTaxes = totalPrice + taxes;


        if (input.equals("special")) {
            totalPriceWithTaxes -= totalPriceWithTaxes * 0.1;
        }

        printReciept(totalPrice, taxes, totalPriceWithTaxes);
    }

    private static void printReciept(double totalPrice, double taxes, double totalPriceWithTaxes) {
        System.out.printf("Congratulations you've just bought a new computer!%n" +
                "Price without taxes: %.2f$%n" +
                "Taxes: %.2f$%n" +
                "-----------%n" +
                "Total price: %.2f$", totalPrice, taxes, totalPriceWithTaxes);

    }
}
