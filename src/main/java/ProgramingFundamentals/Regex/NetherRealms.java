import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> allDemons = Arrays.stream(scanner.nextLine().split(",\\s*"))
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        for (int i = 0; i < allDemons.size(); i++) {
            int health = health(allDemons.get(i));
            double damage = damage(allDemons.get(i));
            System.out.printf("%s - %d health, %.2f damage%n", allDemons.get(i), health, damage);
        }
    }

    private static double damage(String demon) {
        String regex = "-?[0-9]+\\.?[0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);
        double damage = 0;
        while (matcher.find()) {
            damage += Double.parseDouble(matcher.group());
        }
        for (int i = 0; i < demon.length(); i++) {
            char currentChar = demon.charAt(i);
            if (currentChar == '*') {
                damage *= 2;
            } else if (currentChar == '/') {
                damage /= 2;
            }
        }
        return damage;
    }

    private static int health(String demon) {
        int health = 0;
        for (int i = 0; i < demon.length() ; i++) {
            char currentChar = demon.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                health += currentChar;
            }
        }
        return health;
    }
}
