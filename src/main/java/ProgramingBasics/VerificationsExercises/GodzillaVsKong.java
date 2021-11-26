import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход
        double budget = Double.parseDouble(scanner.nextLine());
        int numOfWalkOn = Integer.parseInt(scanner.nextLine());
        double costOfCostume = Double.parseDouble(scanner.nextLine());

        // Декорът е 10% от бюджета
        // Ако има повече от 150 статиста има 10% отстъпка за облеклото

        double decor = budget * 0.1;
        double payForCostumes = costOfCostume * numOfWalkOn;

        if (numOfWalkOn > 150) {
            payForCostumes *= 0.90;
        }

        // Проверка достатъчно средства ли има

        double cost = decor + payForCostumes;
        budget -= cost;

        // Изход

        if (budget < 0) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget);
        }
    }
}
