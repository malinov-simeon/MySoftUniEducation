import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxCapacity = Double.MIN_VALUE;
        String maxModel = "";
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double capacity = Math.PI * Math.pow(radius, 2) * height;

            if (capacity > maxCapacity) {
                maxCapacity = capacity;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}
