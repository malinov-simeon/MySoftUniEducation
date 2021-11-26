import java.util.Scanner;

public class CruiseShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cruiseType = scanner.nextLine();
        String cabinType = scanner.nextLine();
        int numberOvernights = Integer.parseInt(scanner.nextLine());

        double overnightPrice = 0;

        if (cruiseType.equals("Mediterranean")){

            switch (cabinType){
                case "standard cabin":
                    overnightPrice = 27.5;
                    break;
                case "cabin with balcony":
                    overnightPrice = 30.20;
                    break;
                case "apartment":
                    overnightPrice = 40.50;
                    break;
            }

        } else if (cruiseType.equals("Adriatic")){

            switch (cabinType){
                case "standard cabin":
                    overnightPrice = 22.99;
                    break;
                case "cabin with balcony":
                    overnightPrice = 25.00;
                    break;
                case "apartment":
                    overnightPrice = 34.99;
                    break;
            }

        } else if (cruiseType.equals("Aegean")){

            switch (cabinType){
                case "standard cabin":
                    overnightPrice = 23.00;
                    break;
                case "cabin with balcony":
                    overnightPrice = 26.60;
                    break;
                case "apartment":
                    overnightPrice = 39.80;
                    break;
            }
        }

        double holidayPrice = overnightPrice * numberOvernights * 4;

        if (numberOvernights > 7){
            holidayPrice -= holidayPrice * 0.25;
        }
            System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruiseType, holidayPrice);
    }
}
