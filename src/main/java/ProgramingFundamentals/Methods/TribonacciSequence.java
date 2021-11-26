import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        tribonacciSequence(n);
    }

    private static void tribonacciSequence(int n) {
        List<Integer> tribonacciSequence = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int integer = 1;
            for (int j = 0; j < 3; j++) {
                if (tribonacciSequence.size() == 2) {
                    integer += tribonacciSequence.get(0);
                    break;
                } else if (tribonacciSequence.size() >= 3) {
                    integer += tribonacciSequence.get(tribonacciSequence.size() - 1 - j);
                    if (j == 2) {
                        integer--;
                    }
                } else {
                    break;
                }
            }
            tribonacciSequence.add(integer);
            System.out.print(tribonacciSequence.get(i) + " ");
        }
    }
}
