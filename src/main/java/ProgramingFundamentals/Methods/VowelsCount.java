import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        vowelsCount(input);
    }

    private static void vowelsCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char index = input.charAt(i);
            switch (index) {
                case 'a':
                case 'o':
                case 'e':
                case 'u':
                case 'i':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
