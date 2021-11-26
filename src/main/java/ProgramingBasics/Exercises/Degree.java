import java.util.Scanner;
public class Degree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("С = ");
        double c = input.nextDouble();
        double f = (c * 1.8 + 32);
       System.out.print("F = ");
        System.out.printf("%.2f",f);
        input.close();
    }
}