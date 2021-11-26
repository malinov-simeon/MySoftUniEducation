import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        readInput(input);
    }

    private static void readInput(String input) {
        Scanner sc = new Scanner(System.in);
        switch (input) {
            case "int":
                int integer = Integer.parseInt(sc.nextLine());
                System.out.println(integer * 2);
                break;
            case "real":
                double number = Double.parseDouble(sc.nextLine());
                double result = number * 1.5;
                System.out.printf("%.2f", result);
                break;
            case "string":
                String string = sc.nextLine();
                System.out.println("$" + string + "$");
                break;
        }
    }
}
