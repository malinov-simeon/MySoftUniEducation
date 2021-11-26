import java.util.Scanner;

public class PrintTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int numberSum = 0;

        for (int number = startNumber; number <= endNumber; number++) {
            System.out.print(number + " ");
            numberSum += number;
        }

        System.out.println();
        System.out.println("Sum: " + numberSum);
    }
}
