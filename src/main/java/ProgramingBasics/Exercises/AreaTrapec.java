import java.util.Scanner;
public class AreaTrapec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double h = input.nextDouble();
        double S = (a + b) * h / 2.0;

        System.out.printf("%.2f",S);
    System.out.println();}
}
