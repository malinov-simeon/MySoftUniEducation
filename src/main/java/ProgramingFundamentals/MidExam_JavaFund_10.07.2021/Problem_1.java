import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantityFood = Double.parseDouble(scanner.nextLine()); //kg
        double quantityHay = Double.parseDouble(scanner.nextLine());
        double quantityCover = Double.parseDouble(scanner.nextLine());
        double guineaPigsWeight = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= 30; i++) {
            quantityFood -= 0.3;
            if (quantityFood < 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
            if (i % 2 == 0) {
                quantityHay -= quantityFood * 0.05;
                if (quantityHay < 0) {
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            }
            if (i % 3 == 0) {
                quantityCover -= guineaPigsWeight / 3;
                if (quantityCover < 0) {
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFood
                , quantityHay, quantityCover);
    }
}
