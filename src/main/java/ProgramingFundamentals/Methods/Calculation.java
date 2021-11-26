import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        if ("add".equals(operation)) {
            add(number1, number2);
        } else if ("multiply".equals(operation)) {
            multiply(number1, number2);
        } else if ("subtract".equals(operation)) {
            subtract(number1, number2);
        } else if ("divide".equals(operation)) {
            divide(number1, number2);
        }
    }

    private static void divide(int number1, int number2) {
        System.out.println(number1 / number2);
    }

    private static void subtract(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    private static void multiply(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    private static void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }
}
