import java.util.Scanner;

public class FishTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = (Double.parseDouble(scanner.nextLine()) / 10);
        double b = (Double.parseDouble(scanner.nextLine()) / 10);
        double h = (Double.parseDouble(scanner.nextLine()) / 10);
        double percent = Double.parseDouble(scanner.nextLine());

        double v = a * b * h;
        double convertPercent = percent * 0.01;

        double totalLiters = v * (1 - convertPercent);

        System.out.printf("%.3f", totalLiters);

    }
}
