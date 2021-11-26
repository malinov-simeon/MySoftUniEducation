import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[0];
            String name = input.split("\\s+")[1];
            if (command.equals("register")) {
                if (cars.containsKey(name)) {
                    //ERROR: already registered with plate number {licensePlateNumber
                    System.out.println("ERROR: already registered with plate number " + cars.get(name));
                } else {
                    String number = input.split("\\s+")[2];
                    cars.put(name, number);
                    System.out.println(name + " registered " + number + " successfully");
                }
            } else {
                if (cars.containsKey(name)) {
                    cars.remove(name);
                    System.out.println(name + " unregistered successfully");
                } else {
                    System.out.println("ERROR: user " + name + " not found");
                }
            }
        }
        cars.entrySet().forEach(c -> System.out.println(c.getKey() + " => " + c.getValue()));
    }
}
