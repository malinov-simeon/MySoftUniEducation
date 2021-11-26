import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        switch (day){
            case "Friday":
                switch (groupType){
                    case "Students":
                        price=8.45;
                        break;
                    case "Business":
                        price=10.90;
                        break;
                    case "Regular":
                        price=15;
                }
                break;
            case "Saturday":
                switch (groupType){
                    case "Students":
                        price=9.80;
                        break;
                    case "Business":
                        price=15.60;
                        break;
                    case "Regular":
                        price=20;
                }
                break;
            case "Sunday":
                switch (groupType){
                    case "Students":
                        price=10.46;
                        break;
                    case "Business":
                        price=16;
                        break;
                    case "Regular":
                        price=22.50;
                }
                break;
        }

        double totalPrice = people * price;

        switch (groupType){
            case "Students":
                if (people>=30){
                    totalPrice *= 0.85;
                }
                break;
            case "Business":
                if (people>=100){
                    totalPrice -= price * 10;
                }
                break;
            case "Regular":
                if (people>=10 && people<=20){
                    totalPrice *= 0.95;
                }
                break;
        }

        System.out.printf("Total price: %.2f",totalPrice);
    }
}
