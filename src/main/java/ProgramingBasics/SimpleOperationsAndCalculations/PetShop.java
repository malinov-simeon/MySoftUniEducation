import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDogs = Integer.parseInt(scanner.nextLine());
        int numberOtherAnimals = Integer.parseInt(scanner.nextLine());

        double priceDogFood = 2.5;
        int priceOtherFood = 4;

        double totalDogFood = numberOfDogs * priceDogFood;
        int totalOtherFood = numberOtherAnimals * priceOtherFood;

        double totalMoneyForFood = totalDogFood + totalOtherFood;

        System.out.printf("%.2f lv.", totalMoneyForFood);
    }
}
