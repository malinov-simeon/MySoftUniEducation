import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> fib = new ArrayDeque<>();
        int firstNumber = 1;
        int secondNumber = 1;
        fib.push(firstNumber);
        fib.push(secondNumber);

        for (int i = 0; i < n; i++) {
            firstNumber = fib.pop();
            secondNumber = fib.pop();
            int newNumber = firstNumber + secondNumber;
            fib.push(secondNumber);
            fib.push(firstNumber);
            fib.push(newNumber);
        }

        fib.pop();
        System.out.println(fib.pop());
    }
}
