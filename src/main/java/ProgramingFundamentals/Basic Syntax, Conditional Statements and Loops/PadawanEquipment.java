import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightsabersCost = (Math.ceil(students + students * 0.1) * lightsaberPrice);
        double robesCost = students * robePrice;
        double beltsCost = students * beltPrice - (students / 6 * beltPrice); // всеки 6ти колан е безплатен

        double totalExpenses = lightsabersCost + robesCost + beltsCost;

        if (money >= totalExpenses) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalExpenses);
        } else {
            money = Math.abs(money - totalExpenses);
            System.out.printf("George Lucas will need %.2flv more.", money);
        }
    }
}
