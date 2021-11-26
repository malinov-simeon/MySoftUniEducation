import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char [] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            textArray[i] += 3;
        }
        System.out.println(Arrays.toString(textArray).replaceAll("[\\[\\], ]", ""));
    }
}
