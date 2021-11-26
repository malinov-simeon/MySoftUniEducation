import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        multiplicationSign(number1,number2,number3);
    }

    private static void multiplicationSign(int number1, int number2, int number3) {
        int negativeCount = 0;
        if (number1 < 0) {
            negativeCount++;
        } else if (number1 == 0) {
            System.out.println("zero");
            return;
        }
        if (number2 < 0) {
            negativeCount++;
        } else if (number2 == 0) {
            System.out.println("zero");
            return;
        }
        if (number3 < 0) {
            negativeCount++;
        } else if (number3 == 0) {
            System.out.println("zero");
            return;
        }
        if (negativeCount % 2 == 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
