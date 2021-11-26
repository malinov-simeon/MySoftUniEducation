import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceWhiskey = Double.parseDouble(scanner.nextLine());

       double litersBeer = Double.parseDouble(scanner.nextLine());
       double litersWine = Double.parseDouble(scanner.nextLine());
       double litersRakiq = Double.parseDouble(scanner.nextLine());
       double litersWhiskey = Double.parseDouble(scanner.nextLine());

        double priceRakiq = priceWhiskey - priceWhiskey * 0.5;
        double priceWine = priceRakiq - priceRakiq * 0.4;
        double priceBeer = priceRakiq - priceRakiq * 0.8;

        double totalBeer = priceBeer * litersBeer;
        double totalWine = priceWine * litersWine;
        double totalRakiq = priceRakiq * litersRakiq;
        double totalWhiskey = priceWhiskey * litersWhiskey;

        double bill = totalBeer + totalRakiq + totalWhiskey + totalWine;

        System.out.printf("%.2f", bill);

    }
}
