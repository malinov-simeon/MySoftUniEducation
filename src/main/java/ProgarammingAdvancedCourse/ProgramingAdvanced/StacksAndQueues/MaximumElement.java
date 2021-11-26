import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String [] command = scanner.nextLine().split("\\s+");

            switch (command[0]) {
                case "1":
                    deque.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    deque.pop();
                    break;
                case "3":
                    int maximumElement = Integer.MIN_VALUE;
                    for (Integer integer : deque) {
                        if (integer > maximumElement) {
                            maximumElement = integer;
                        }
                    }
                    System.out.println(maximumElement);
                    break;
            }
        }
    }
}
