import java.util.Scanner;

public class DartsTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingPoints = Integer.parseInt(scanner.nextLine());
        int movesCounter = 0;

        while (startingPoints > 0){
            movesCounter++;

            String targetSector = scanner.nextLine();

            if (targetSector.equals("bullseye")){
                System.out.printf("Congratulations! You won the game with a bullseye in %d moves!",movesCounter);
                break;
            }

            int points = Integer.parseInt(scanner.nextLine());

            if (targetSector.equals("double ring")){
                points *= 2;
            } else if (targetSector.equals("triple ring")){
                points *= 3;
            }

            startingPoints -= points;


            if (startingPoints == 0){
                System.out.printf("Congratulations! You won the game in %d moves!",movesCounter);
                break;
            }
            else if (startingPoints < 0){
                System.out.printf("Sorry, you lost. Score difference: %d.",Math.abs(startingPoints));
            break;
            }
        }
    }
}
