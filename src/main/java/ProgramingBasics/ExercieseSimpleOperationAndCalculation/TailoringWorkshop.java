import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSqTables = Integer.parseInt(scanner.nextLine());
        double tableLength = Double.parseDouble(scanner.nextLine());
        double tableWidth = Double.parseDouble(scanner.nextLine());

        double tablecloth = numSqTables * (tableLength + 2 * 0.3) * (tableWidth + 2 * 0.3);
        double coach = numSqTables * (tableLength / 2) * (tableLength / 2);

        double costUsd = tablecloth * 7 + coach * 9;
        double costLv = costUsd * 1.85;

        System.out.printf("%.2f USD", costUsd);
        System.out.println();
        System.out.printf("%.2f BGN", costLv);



    }
}
