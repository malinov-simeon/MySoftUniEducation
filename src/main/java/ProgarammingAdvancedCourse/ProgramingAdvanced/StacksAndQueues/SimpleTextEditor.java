import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        ArrayDeque<StringBuilder> deque = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[0];

            switch (command) {
                case "1":
                    text.append(input.split("\\s+")[1]);
                    deque.push(text);
                    break;
                case "2":
                    int count = Integer.parseInt(input.split("\\s+")[1]);
                    for (int j = 0; j < count; j++) {
                        text.deleteCharAt(text.length() - 1);
                    }
                    deque.push(text);
                    break;
                case "3":
                    int index = Integer.parseInt(input.split("\\s+")[1]);
                    System.out.println(text.charAt(index));
                    break;
                case "4":
                    int i1 = Integer.parseInt(input.split("\\s+")[1]);
                    for (int j = 0; j < i1; j++) {
                        deque.pop();
                    }
                    break;
            }
        }
    }
}
