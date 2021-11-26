import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strings = scanner.nextLine().split("\\s+");
        multyplier(strings[0], strings[1]);
    }

    private static void multyplier(String string, String string1) {
        int sum = 0;
        int longerLength = Math.max(string.length(), string1.length());
        int smallerLength = Math.min(string.length(), string1.length());
        for (int i = 0; i < smallerLength; i++) {
            sum += string.charAt(i) * string1.charAt(i);
        }
        for (int i = smallerLength; i < longerLength; i++) {
            if (string.length() > string1.length()) {
                sum += string.charAt(i);
            } else {
                sum += string1.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
