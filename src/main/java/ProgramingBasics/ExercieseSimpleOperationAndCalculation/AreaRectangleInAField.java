import java.util.Scanner;

public class AreaRectangleInAField {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double length = Math.abs(x1 - x2);
        double width = Math.abs(y1 - y2);

        double area = length * width;
        double parameter = 2 * (length + width);

        System.out.printf("%.2f", area);
        System.out.println();
        System.out.printf("%.2f", parameter);
    }
}
