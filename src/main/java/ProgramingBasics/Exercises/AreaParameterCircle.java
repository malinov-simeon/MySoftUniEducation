import java.util.Scanner;

public class AreaParameterCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * r *r;
        double parameter = Math.PI * 2 * r;

        System.out.printf("%.2f %n", area);
        System.out.printf("%.2f", parameter);
    }
}
