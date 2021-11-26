import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Вход

        double holidayCost = Double.parseDouble(scanner.nextLine());
        int puzzels = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzelsPrice = 2.60;
        int talkingDollsPrice = 3;
        double teddyBearsPrice = 4.10;
        double minionsPrice = 8.20;
        int trucksPrice = 2;

        int numberOfToys =puzzels + talkingDolls + teddyBears + minions + trucks;
        double toysCost = puzzels * puzzelsPrice + talkingDolls * talkingDollsPrice + teddyBears * teddyBearsPrice + minions * minionsPrice + trucks * trucksPrice;

        // Спечелени и изразходвани пари
        // Ако играчките са 50 или повече да се направи 25% отстъпка
        // 10% от парите са за наем

        if (numberOfToys >= 50) {
            toysCost = toysCost - toysCost * 0.25;
        }

        double rent = toysCost * 0.1;

        double profit = toysCost - rent;
        double leftProfit = profit - holidayCost;

        if (leftProfit >= 0) {
            System.out.printf("Yes! %.2f lv left.", leftProfit);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(leftProfit));
        }

    }
}
