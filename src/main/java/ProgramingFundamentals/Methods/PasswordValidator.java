import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean length = length(password);
        if (!length) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean characters = characters(password);
        if (!characters) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean digits = digits(password);
        if (!digits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (length && characters && digits) {
            System.out.println("Password is valid");
        }
    }

    private static boolean digits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {

            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                count++;
            }
        }
        return count >= 2;
    }

    private static boolean characters(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
        if (!Character.isLetterOrDigit(currentChar)) {
                return false;
            }
        }
        return true;
    }

    private static boolean length(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }
}
