import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementsToOffer = scanner.nextInt();
        int elementsToPoll = scanner.nextInt();
        int findElement = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < elementsToOffer; i++) {
            queue.offer(scanner.nextInt());
        }

        for (int i = 0; i < elementsToPoll; i++) {
            queue.poll();
        }

        boolean isFound = false;

        for (Integer integer : queue) {
            if (integer == findElement) {
                isFound = true;
                break;
            }
        }

        if (queue.isEmpty()) {
            System.out.println("0");
        } else {
            if (isFound) {
                System.out.println("true");
            } else {
                int smallestNumber = Integer.MAX_VALUE;
                for (Integer integer : queue) {
                    if (integer < smallestNumber) {
                        smallestNumber = integer;
                    }
                }
                System.out.println(smallestNumber);
            }
        }
    }
}
