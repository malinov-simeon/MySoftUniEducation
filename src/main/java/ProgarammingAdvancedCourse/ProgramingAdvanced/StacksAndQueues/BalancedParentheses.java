import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> parentheses = new ArrayDeque<>();
        boolean isSuccess = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') {
                parentheses.push(input.charAt(i));
                continue;
            }
            // required to pass error tests
            if (parentheses.isEmpty()) {
                isSuccess = false;
                break;
            }

            // Peek not Pop, only Pop when valid case
            if (input.charAt(i) == '}' && parentheses.peek() == '{'
                    || input.charAt(i) == ']' && parentheses.peek() == '['
                    || input.charAt(i) == ')' && parentheses.peek() == '(') {
                parentheses.pop();
            } else {
                isSuccess = false;
                break;
            }
        }

        if (isSuccess) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
