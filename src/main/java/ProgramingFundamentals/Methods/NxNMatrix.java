import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Matrix(n);
    }

    private static void Matrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int columns = 0; columns < n; columns++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
