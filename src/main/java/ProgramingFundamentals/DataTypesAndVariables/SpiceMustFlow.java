import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int harvest = 0;

        while (yield >= 100) {

            harvest += yield - 26;

            days++;
            yield -= 10;
        }

        if (harvest >= 26) {
            harvest -= 26;
        }

        System.out.printf("%d%n%d", days, harvest);
    }
}
