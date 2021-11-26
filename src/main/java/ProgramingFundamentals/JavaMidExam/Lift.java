import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line = Integer.parseInt(scanner.nextLine());
        int[] cabins = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int cabin = 0; cabin < cabins.length; cabin++) {
            int freeSpace = 4 - cabins[cabin];
            if (cabins[cabin] + line <= 4) {
                cabins[cabin] += line;
                line = 0;
                break;
            } else if (freeSpace <= 4 && freeSpace > 0) {
                line -= freeSpace;
                cabins[cabin] += freeSpace;
            }
        }

        boolean emptySpace = false;
        for (int cabin : cabins) {
            if (cabin < 4) {
                emptySpace = true;
                break;
            }
        }

        if (emptySpace) {
            System.out.println("The lift has empty spots!");
        } else if (line > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", line);
        }

        for (int cabin : cabins) {
            System.out.print(cabin + " ");
        }
    }
}
