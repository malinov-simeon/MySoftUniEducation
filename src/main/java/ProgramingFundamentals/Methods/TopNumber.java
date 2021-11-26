import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        topNumber(n);
    }

    private static void topNumber(int n) {
        for (int currentNumber = 1; currentNumber <= n; currentNumber++) {
            int myNumber = currentNumber;
            int digitsSum = 0;
            boolean oddNumber = false;
            while (myNumber != 0) {
                int currentDigit = myNumber % 10;
                digitsSum += currentDigit;
                if (currentDigit % 2 != 0) {
                    oddNumber = true;
                }
                myNumber /= 10;
            }
            if (digitsSum % 8 == 0 && oddNumber) {
                System.out.println(currentNumber);
            }
        }
    }
}
