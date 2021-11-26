import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalMoney = 0;
        while (!input.equals("Start")) {

            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                totalMoney += coin;
            } else {
                System.out.printf("Cannot accept %.2f", coin);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {

            switch (input){
                case "Nuts":
                    if (totalMoney>=2){
                        System.out.println("Purchased " + input);
                        totalMoney -= 2;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (totalMoney>=0.7){
                        System.out.println("Purchased " + input);
                        totalMoney -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (totalMoney>=1.5){
                        System.out.println("Purchased " + input);
                        totalMoney -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (totalMoney>=0.8){
                        System.out.println("Purchased " + input);
                        totalMoney -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (totalMoney>=1){
                        System.out.println("Purchased " + input);
                        totalMoney -= 1;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalMoney);
    }
}
