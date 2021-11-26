import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Registration")) {
            String command = input.split(" ")[0];
            switch (command) {
                case "Letters":
                    String lowerUpper = input.split(" ")[1];
                    switch (lowerUpper) {
                        case "Lower":
                            username = username.toLowerCase();
                            System.out.println(username);
                            break;
                        case "Upper":
                            username = username.toUpperCase();
                            System.out.println(username);
                            break;
                    }
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(input.split(" ")[1]);
                    int endIndex = Integer.parseInt(input.split(" ")[2]) + 1;
                    if (startIndex < username.length()
                            && startIndex >= 0
                            && endIndex >= 0
                            && endIndex < username.length()) {
                        StringBuilder reversedPart = new StringBuilder(username.substring(startIndex, endIndex))
                                .reverse();
                        System.out.println(reversedPart);
                    }
                    break;
                case "Substring":
                    String substring = input.split(" ")[1];
                    if (username.contains(substring)) {
                        username = username.replace(substring, "");
                        System.out.println(username);
                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n", username, substring);
                    }
                    break;
                case "Replace":
                    String replace = input.split(" ")[1];
                    username = username.replace(replace, "-");
                    System.out.println(username);
                    break;
                case "IsValid":
                    String valid = input.split(" ")[1];
                    if (username.contains(valid)) {
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%s must be contained in your username.%n", valid);
                    }
            }
            input = scanner.nextLine();
        }
    }
}
