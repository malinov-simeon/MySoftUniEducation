import java.util.Scanner;
public class AreaTriugulnik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double h = input.nextDouble();
        double S = a * h / 2.0;

        System.out.printf("%.2f",S);
        System.out.println();
       }
}
