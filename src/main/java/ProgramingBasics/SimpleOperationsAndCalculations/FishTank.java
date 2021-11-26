import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aCm = (Integer.parseInt(scanner.nextLine()) );
        int bCm = (Integer.parseInt(scanner.nextLine()) );
        int hCm = (Integer.parseInt(scanner.nextLine()) );
        double percent = Double.parseDouble(scanner.nextLine());

        int vCm = aCm * bCm * hCm;
        double convertVDm = vCm * 0.001;
        double percentConvert = percent * 0.01;
        double totalLiters = convertVDm * (1 - percentConvert);


        System.out.printf("%.3f", totalLiters);
    }
}
