import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementsToPush = scanner.nextInt();
        int elementsToPop = scanner.nextInt();
        int findElement = scanner.nextInt();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            deque.push(scanner.nextInt());
        }

        for (int i = 0; i < elementsToPop; i++) {
            deque.pop();
        }

        boolean isFound = false;

        for (Integer integer : deque) {
            if (integer == findElement) {
                isFound = true;
                break;
            }
        }

        if (deque.isEmpty()) {
            System.out.println("0");
        } else {
            if (isFound) {
                System.out.println("true");
            } else {
                int smallestNumber = Integer.MAX_VALUE;
                for (Integer integer : deque) {
                    if (integer < smallestNumber) {
                        smallestNumber = integer;
                    }
                }
                System.out.println(smallestNumber);
            }
        }
    }
}
