import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 0;
        for (int i = 0; i < n; i++) {
            int litersPour = Integer.parseInt(scanner.nextLine());

            if (capacity + litersPour > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity += litersPour;
            }

        }

        System.out.println(capacity);
    }
}
