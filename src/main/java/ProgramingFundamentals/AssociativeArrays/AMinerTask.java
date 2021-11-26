import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , Integer> resource = new LinkedHashMap<>();
        String input = scanner.nextLine();
        String currentResource = "";
        int count = 0;
        while(!input.equals("stop")) {
            count++;
            if (count % 2 != 0) {
                if (!resource.containsKey(input)) {
                    resource.put(input, 0);
                }
                currentResource = input;
            } else {
                resource.put(currentResource, resource.get(currentResource) + Integer.parseInt(input));
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : resource.entrySet()) {
            System.out.printf("%s -> %d%n", stringIntegerEntry.getKey()
                                            ,stringIntegerEntry.getValue());
        }
    }
}
