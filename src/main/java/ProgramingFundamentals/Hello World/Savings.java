import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desiIncome = Double.parseDouble(scanner.nextLine());
        int numberOfMonthsForSaving = Integer.parseInt(scanner.nextLine());
        double desiExpenses = Double.parseDouble(scanner.nextLine());

        // desiIncome - (30% от desiIncome + desiExpenses) получаваме сумата, която ще спестява

        double moneyDesiCanSave = desiIncome - (desiIncome * 0.3 + desiExpenses);

        double totalMoneyDesiCanSave = moneyDesiCanSave * numberOfMonthsForSaving;

        double percentsDesiCanSave = moneyDesiCanSave / desiIncome * 100;

        System.out.printf("She can save %.2f%%%n",percentsDesiCanSave);
        System.out.printf("%.2f", totalMoneyDesiCanSave);
    }
}
