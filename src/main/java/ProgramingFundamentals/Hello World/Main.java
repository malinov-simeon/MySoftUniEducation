import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        double a = input.get(0);
        double b = input.get(1);
        double c = input.get(2);

        double D = Math.sqrt((Math.pow(b, 2) - 4 * a * c));

        if (D < 0) {
            System.out.println("Quadratic equation has no real roots!");
        } else if (D == 0) {
            double x = -(b / 2 * a);
            System.out.printf("x = %.2f%n", x);
        } else {
            double x1 = (-b + D) / 2 * a;
            double x2 = (-b - D) / 2 * a;

            System.out.printf("x1 = %.2f%n", x1);
            System.out.printf("x2 = %.2f%n", x2);
        }
    }
}
