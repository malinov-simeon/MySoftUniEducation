import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(e -> Integer.parseInt(e)).
                toArray();


        // ints[0] ?= ints [1, 2, 3...]
        // ints[11] ?=

        for (int i = 0; i < ints.length; i++) {

            boolean isBigger = true; // isBigger = false

            for (int j = i + 1; j < ints.length; j++) {

                if (ints[i] <= ints[j]) {
                    isBigger = false;
                    break;
                }
            }

            if (isBigger) {
                System.out.print(ints[i] + " ");
            }
        }
    }
}
