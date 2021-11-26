import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        int attackedPlanetsCount = 0;
        List<String> destroyedPlanets = new ArrayList<>();
        int destroyedPlanetsCount = 0;
        for (int i = 0; i < n; i++) {
            String encryptedMessage = scanner.nextLine();
            int count = getCount(encryptedMessage);
            String decryptedMessage = decryptMessage(encryptedMessage, count);

            String regex = "[^@,\\-!:>]*@(?<planetName>[A-Za-z]+)[^@,\\-!:>]*:(?<population>[0-9]+)[^@,\\-!:>]*!(?<attackType>[AD])![^@,\\-!:>]*->(?<soldierCount>[0-9]+)[^@,\\-!:>]*";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {
                String attackedPlanet = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soldiers = Integer.parseInt(matcher.group("soldierCount"));

                if (attackType.equals("A")) {
                    attackedPlanetsCount++;
                    attackedPlanets.add(attackedPlanet);
                } else {
                    destroyedPlanetsCount++;
                    destroyedPlanets.add(attackedPlanet);
                }
            }
        }

        
        System.out.println("Attacked planets: " + attackedPlanetsCount);
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));
        System.out.println("Destroyed planets: " + destroyedPlanetsCount);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    private static String decryptMessage(String encryptedMessage, int count) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (int j = 0; j < encryptedMessage.length(); j++) {
            char currentChar = (char) (encryptedMessage.charAt(j) - count);
            decryptedMessage.append(currentChar);
        }
        return decryptedMessage.toString();
    }

    private static int getCount(String encryptedMessage) {
        int count = 0;
        for (int j = 0; j < encryptedMessage.length(); j++) {
            if (encryptedMessage.charAt(j) == 's' ||
                    encryptedMessage.charAt(j) == 't' ||
                    encryptedMessage.charAt(j) == 'a' ||
                    encryptedMessage.charAt(j) == 'r' ||
                    encryptedMessage.charAt(j) == 'S' ||
                    encryptedMessage.charAt(j) == 'T' ||
                    encryptedMessage.charAt(j) == 'A' ||
                    encryptedMessage.charAt(j) == 'R') {
                count++;
            }
        }
        return count;
    }
}
