import java.util.Scanner;

public class CruiseGamesUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        int players = 0;

        double volleyballTotalPoints = 0;
        double volleyballGamesPlayed = 0;
        double tennisTotalPoints = 0;
        double tennisTGamesPlayed = 0;
        double badmintonTotalPoints = 0;
        double badmintonGamesPlayed = 0;

        while (!player.equals("End")) {
            players++;
            // Въртим играчи
            int gamesPlayed = Integer.parseInt(scanner.nextLine());
            double totalPoints = 0;

            while (gamesPlayed > 0) {

                String game = scanner.nextLine();
                double points = Double.parseDouble(scanner.nextLine());

                if ("volleyball".equals(game)) {
                    points *= 1.07;
                    volleyballGamesPlayed++;
                    volleyballTotalPoints += points;
                } else if ("tennis".equals(game)) {
                    points *= 1.05;
                    tennisTGamesPlayed++;
                    tennisTotalPoints += points;
                } else if ("badminton".equals(game)) {
                    points *= 1.02;
                    badmintonTotalPoints += points;
                    badmintonGamesPlayed++;
                }
                totalPoints += points;
                gamesPlayed--;
            }


            if (volleyballTotalPoints/volleyballGamesPlayed>=75 && tennisTotalPoints/tennisTGamesPlayed>=75 && badmintonTotalPoints/badmintonGamesPlayed>=75){
                // Ако човека не е играл определена игра първо проверяваме дали броя е > 0
                // if vgb>0 else
                // if tgp>0
                // if bgp>0
                System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.",player,Math.floor(totalPoints));
            } else {
                System.out.printf("Sorry, %s, you lost. Your points are only %.0f.",player,Math.floor(totalPoints));
            }

            player = scanner.nextLine();
        }

        System.out.printf("%d players played.",players);
    }
}
