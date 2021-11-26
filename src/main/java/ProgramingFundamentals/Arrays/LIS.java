import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] len = new int[ints.length];
        int[] prev = new int[ints.length];
        List<Integer> LIS = new ArrayList<>(5);
        for (int i = 0; i < ints.length; i++) {
            LIS.add(ints[i]);
            if (LIS.get(i) ) {

            }
        }
    }
}
