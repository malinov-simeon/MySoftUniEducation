import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (!(currentChar == ' ')) {
                if (symbolsCount.containsKey(currentChar)) {
                    symbolsCount.put(currentChar, symbolsCount.get(currentChar) + 1 );
                } else {
                    symbolsCount.put(currentChar, 1);
                }
            }
        }
        symbolsCount.entrySet().forEach(c -> System.out.println(c.getKey() + " -> " + c.getValue()));
    }
}
