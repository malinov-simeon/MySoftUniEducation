import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String instruction = scanner.nextLine();

        String current = null;

        while (!instruction.equals("Home")) {
            if (instruction.equals("back")) {
                history.pop();
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    System.out.println(current);
                }
            } else {
                current = instruction;
                System.out.println(instruction);
                history.push(instruction);
            }

            instruction = scanner.nextLine();
        }
    }
}
