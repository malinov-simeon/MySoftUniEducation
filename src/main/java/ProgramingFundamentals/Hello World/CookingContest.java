import java.util.Scanner;

public class CookingContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int participants = Integer.parseInt(scanner.nextLine());
        int allBakery = 0;
        double totalSumForCharity = 0;

        for (int participant = 1; participant <= participants; participant++) {

            String name = scanner.nextLine();
            String sweetType = scanner.nextLine();
            int cookiesBaked = 0;
            int cakesBaked = 0;
            int wafflesBaked = 0;

            while (!sweetType.equals("Stop baking!")){

                int sweetsBaked = Integer.parseInt(scanner.nextLine());
                allBakery += sweetsBaked;

                switch (sweetType){
                    case "cookies":
                        cookiesBaked += sweetsBaked;
                        totalSumForCharity += sweetsBaked * 1.5;
                        break;
                    case "cakes":
                        cakesBaked += sweetsBaked;
                        totalSumForCharity += sweetsBaked * 7.8;
                        break;
                    case "waffles":
                        wafflesBaked += sweetsBaked;
                        totalSumForCharity += sweetsBaked * 2.3;
                        break;
                }
                sweetType = scanner.nextLine();
            }
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n",name,cookiesBaked,cakesBaked,wafflesBaked);
        }
        System.out.printf("All bakery sold: %d%n", allBakery);
        System.out.printf("Total sum for charity: %.2f lv.",totalSumForCharity);
    }
}
