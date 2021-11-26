import java.util.Scanner;

public class SummerShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aniBudget = Integer.parseInt(scanner.nextLine());
        double towelPrice = Double.parseDouble(scanner.nextLine());
        int percentsDiscount = Integer.parseInt(scanner.nextLine());

        double umbrellaPrice = towelPrice * 2/3.0;
        double flipFlopPrice = umbrellaPrice * 0.75;
        double beachBagPrice = 1/3.0 * (flipFlopPrice + towelPrice);

        double totalExpenses = towelPrice + umbrellaPrice + flipFlopPrice + beachBagPrice;
        double totalExpensesWithDiscount = totalExpenses - totalExpenses * percentsDiscount /100;

        double aniMoneyLeft = Math.abs(aniBudget - totalExpensesWithDiscount);

        if (aniBudget >= totalExpensesWithDiscount){
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", totalExpensesWithDiscount, aniMoneyLeft);
        } else {
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.",totalExpensesWithDiscount, aniMoneyLeft);
        }
    }
}
