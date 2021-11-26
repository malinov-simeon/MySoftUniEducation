import java.util.Scanner;

public class CmToInch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        double valueCm = inch * 2.54;

        System.out.println(valueCm);

    }
}
