import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        double n1Factorial = factorialCalculator(n1);
        double n2Factorial = factorialCalculator(n2);

        factorialDivision(n1Factorial, n2Factorial);
    }

    private static double factorialCalculator(double number) {
        double factorial = 1;
        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
            factorial *= currentNumber;
        }
        return factorial;
    }

    private static void factorialDivision (double n1Factorial, double n2Factorial) {
        double division = n1Factorial / n2Factorial;

        System.out.printf("%.2f", division);
    }
}
