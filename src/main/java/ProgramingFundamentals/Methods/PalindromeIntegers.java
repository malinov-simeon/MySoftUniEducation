import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            palindromeIntegerPrinter(input);
            input = scanner.nextLine();
        }
    }

    private static void palindromeIntegerPrinter(String input) {
        String reverseInput = "";

        for (int index = input.length() - 1; index >= 0; index--) {
            char currentChar = input.charAt(index);
            reverseInput += currentChar;
        }

        if (reverseInput.equals(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
