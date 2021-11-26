import java.util.Scanner;
public class ZelenchukovBorsa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();
double d = input.nextDouble();

double M = a * c;
double M2 = b * d;

double P = (M + M2) / 1.94;

        System.out.printf("%.2f",P);
System.out.println();
    }
}
