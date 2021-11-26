import java.util.Scanner;

public class BoqKushta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double z = Double.parseDouble(scanner.nextLine());

        double stena1 = x*x;
        double vrata = 1.2*2;
        double stena2 = x*y;
        double prozorec = 1.5*1.5;
        double pokriv1 = z*x/2;
        double pokriv2 = x*y;

        double m2pokriv = (pokriv1*2) + (2* pokriv2);
        double m2steni = (stena1*2 + 2*stena2)-(prozorec*2+vrata);

        double LCHB = m2pokriv/4.3;
        double LZB = m2steni/3.4;

        System.out.printf("%.2f", LZB);
        System.out.println();

        System.out.printf("%.2f",LCHB);
        System.out.println();




    }
}
