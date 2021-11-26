import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character ,Integer> symbolsCount = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == ' ') {
                continue;
            } else if (symbolsCount.containsKey(currentChar)) {
                symbolsCount.put(currentChar, symbolsCount.get(currentChar) + 1);
            } else {
                symbolsCount.putIfAbsent(currentChar, 1);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : symbolsCount.entrySet()) {
            System.out.printf("%c -> %d%n"
                    , characterIntegerEntry.getKey()
                    , characterIntegerEntry.getValue());
        }
    }
}
