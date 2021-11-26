import java.util.Scanner;

public class StrongNumberr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int myNumber = number;
        int factSum = 0;

        while (number != 0) {
            int currentNumber = number % 10;

            int fact = 1;
            for (int i = currentNumber; i > 0; i--) {
                // fact=5 -> 5x4x3x2x1
                fact *= i;
            }

            factSum += fact;
            number /= 10;
        }

        if (factSum == myNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
