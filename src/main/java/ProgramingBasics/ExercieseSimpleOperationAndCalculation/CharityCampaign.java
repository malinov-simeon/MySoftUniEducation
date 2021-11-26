import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfCampaign = Integer.parseInt(scanner.nextLine());
        int numberOfBakers = Integer.parseInt(scanner.nextLine());
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfWaffles = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());

        int priceOfCake = 45;
        double priceOfWaffle = 5.8;
        double priceOfPancake = 3.2;

        int totalCakes = numberOfCakes * priceOfCake;
        double totalWaffles = numberOfWaffles * priceOfWaffle;
        double totalPancakes = numberOfPancakes * priceOfPancake;

        double moneyForADay = (totalCakes + totalPancakes + totalWaffles) * numberOfBakers;
        double moneyFromTheCampaign = moneyForADay * daysOfCampaign;
        double moneyAfterExpenses = moneyFromTheCampaign - (moneyFromTheCampaign / 8);

        System.out.printf("%.2f", moneyAfterExpenses);

    }
}
