import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dayPlunder = Integer.parseInt(scanner.nextLine());
        int expectedPlunder = Integer.parseInt(scanner.nextLine());

        double plunderGathered = 0;

        for (int day = 1; day <= days; day++) {
            plunderGathered += dayPlunder;
            if (day % 3 == 0) {
                plunderGathered += dayPlunder * 0.5;
            }
            if (day % 5 == 0) {
                plunderGathered *= 0.7;
            }
        }

        print(expectedPlunder,plunderGathered);
    }

    private static void print(int expectedPlunder, double plunderGathered) {
        if (plunderGathered >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", plunderGathered);
        } else {
            double onePercent = 1.0 * expectedPlunder / 100;
            double percentsGathered = plunderGathered / onePercent;
            System.out.printf("Collected only %.2f%% of the plunder.", percentsGathered);
        }
    }
}
