import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);

        charactersInRange(char1, char2);

    }

    private static void charactersInRange(char char1, char char2) {
        if (char1 > char2) {
            for (char charr = (char) (char2 + 1); charr < char1; charr++) {
                System.out.print(charr + " ");
            }
        } else {
            for (char charr = (char) (char1 + 1); charr < char2; charr++) {
                System.out.print(charr + " ");
            }
        }


    }
}
