import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        List<Integer> stairs = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int sum = 0;
        for (int stair : stairs) {
            sum += stair;
        }

        double stepWidth = 1.0 * sum / stairs.size();
        double stepsHeight = 1.0 * height / stairs.size();

        System.out.println("Step width: " + stepWidth);
        System.out.println("Step height: " + stepsHeight);
        
    }
}
