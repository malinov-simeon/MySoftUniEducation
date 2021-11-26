import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double l = (Double.parseDouble(scanner.nextLine())*100);
        Double w = (Double.parseDouble(scanner.nextLine())*100);
        Double a = (Double.parseDouble(scanner.nextLine())*100);

        double wardrobe = a * a;
        double sizeHall = l * w;
        double bench = sizeHall / 10;
        double freeSpace = sizeHall - wardrobe - bench;

        double availableDancers = Math.floor(freeSpace / 7040);

        System.out.printf("%.0f",availableDancers);
    }
}
