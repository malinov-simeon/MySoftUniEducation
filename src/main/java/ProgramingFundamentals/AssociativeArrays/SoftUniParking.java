import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registeredUsers = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[0];
            String username = input.split("\\s+")[1];
            if (command.equals("register")) {
                String plateNumber = input.split("\\s+")[2];
                if (registeredUsers.containsKey(username)) {
                    System.out.println("ERROR: already registered with plate number " + plateNumber);
                } else {
                    registeredUsers.put(username, plateNumber);
                    System.out.printf("%s registered %s successfully%n", username, plateNumber);
                }
            } else if (command.equals("unregister")) {
                if (!registeredUsers.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    registeredUsers.remove(username);
                    System.out.println(username + " unregistered successfully");
                }
            }
        }
        registeredUsers.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
