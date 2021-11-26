import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] ints = new int[Integer.parseInt(scanner.nextLine())];

        for (int i = 0; i < n; i++) {
            ints[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println();
    }
}
