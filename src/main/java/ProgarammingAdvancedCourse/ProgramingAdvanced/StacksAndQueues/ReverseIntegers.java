import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] integers = scanner.nextLine().split("\\s+");

        ArrayDeque<String> deque = new ArrayDeque<>();

        for (int i = 0; i < integers.length; i++) {
            deque.push(integers[i]);
        }
        while (!deque.isEmpty()) {
            System.out.print(deque.pop() + " ");
        }
    }
}
