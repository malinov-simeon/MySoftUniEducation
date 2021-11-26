import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadset = gamesLost / 2;
        int trashedMouse = gamesLost / 3;
        int trashedKeyboard = gamesLost / 6;
        int trashedDisplay = gamesLost / 12;

        double rageExpenses = headsetPrice * trashedHeadset + mousePrice * trashedMouse + keyboardPrice * trashedKeyboard + displayPrice * trashedDisplay;

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
