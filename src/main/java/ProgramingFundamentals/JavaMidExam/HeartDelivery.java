import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] neighborhood = Arrays
                .stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        int position = 0;

        while (!input.equals("Love!")) {
            int length = Integer.parseInt(input.split("\\s+")[1]);
            position += length;

            if (position >= neighborhood.length) {
                position = 0;
            }

            if (neighborhood[position] > 0) {
                neighborhood[position] -= 2;
                if (neighborhood[position] <= 0) {
                    System.out.printf("Place %d has Valentine's day.%n", position);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", position);
            }
            input = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", position);
        int counter = 0;

        for (int i : neighborhood) {
            if (i > 0) {
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", counter);
        }
    }
}
