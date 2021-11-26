import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = add(num1, num2);
        subtract(sum, num3);

    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }

    private static void subtract (int sum, int num3) {

        System.out.println(sum - num3);
    }
}
