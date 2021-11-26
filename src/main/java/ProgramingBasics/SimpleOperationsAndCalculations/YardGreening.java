import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sizeM2 = Double.parseDouble(scanner.nextLine());

        double price = sizeM2 * 7.61;
        double discountPrice = price * 0.82;
        double discount = price * 0.18;

        System.out.printf("The final price is: %.2f lv.%n", discountPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
