import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int openingBrackets = 0;
        int closingBrackets = 0;
        boolean consecutiveBrackets = true;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                openingBrackets++;
                if (openingBrackets - closingBrackets >= 2) {
                    consecutiveBrackets = false;
                    break;
                }
            } else if (input.equals(")")) {
                closingBrackets++;
                if (closingBrackets > openingBrackets) {
                    consecutiveBrackets = false;
                    break;
                }
            }
        }

        if (openingBrackets != closingBrackets) {
            consecutiveBrackets = false;
        }

        if (consecutiveBrackets) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
