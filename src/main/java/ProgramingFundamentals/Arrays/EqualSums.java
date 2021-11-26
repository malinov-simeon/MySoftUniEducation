package ProgramingFundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        boolean equal = false;

        for (int i = 0; i < ints.length; i++) {
            int rightSum = 0;
            int leftSum = 0;

            for (int j = i + 1; j < ints.length; j++) {
                rightSum += ints[j];
            }
            for (int j = i - 1; j >= 0; j--) {
                leftSum += ints[j];
            }

            if (rightSum == leftSum) {
                System.out.print(i);
                equal = true;
                break;
            } else  if (leftSum == 0 && rightSum == 0) {
                System.out.println("0");
            }
        }

        if (!equal) {
            System.out.println("no");
        }
    }
}
