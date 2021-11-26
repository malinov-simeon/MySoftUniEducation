import java.util.Scanner;

public class TextRomove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textToRemove = scanner.nextLine();
        String text = scanner.nextLine();
        while(text.contains(textToRemove)) {
            text = text.replace(textToRemove, "");
        }
        System.out.println(text);
    }
}
