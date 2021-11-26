import java.util.Scanner;

public class DeclaringAndInvokingMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        PrintSign(n);
    }

    private static void PrintSign(int n) {

        if (n > 0) {
            System.out.printf("The number %d is positive.", n);
        } else if (n < 0) {
            System.out.printf("The number %d is negative.", n);
        } else {
            System.out.printf("The number %d is zero.", n);
        }
    }
}
