import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        middleCharacter(input);
    }

    private static void middleCharacter(String input) {
        if (input.length() % 2 == 0) {
            char symbol1 = input.charAt(input.length() / 2 - 1);
            char symbol2 = input.charAt(input.length() / 2);

            System.out.println("" + symbol1 + symbol2);
        } else {
            char symbol = input.charAt(input.length() / 2);
            System.out.println(symbol);
        }
    }
}
