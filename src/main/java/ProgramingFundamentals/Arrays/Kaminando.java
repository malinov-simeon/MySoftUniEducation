package ProgramingFundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Kaminando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int DNALength = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();

        int[] longestSubsequencesOfOnes = new int[DNALength];

        int countMax = 0;

        while (!input.equals("Clone them!")) {
            int currentCount = 1;
            int[] currentDNA = Arrays.stream(input.split("!"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();

            longestSubsequencesOfOnes = longestSubsequencesOfOnes(currentDNA, longestSubsequencesOfOnes, countMax);

            input = sc.nextLine();
        }
    }

    public static int[] longestSubsequencesOfOnes(int[] currentDNA, int[] longestSubsequencesOfOnes, int countMax) {
        int currentCount = 1;
        int bestCount = 0;

        for (int i = 0; i < currentDNA.length - 1; i++) {

            if (currentDNA[i] == currentDNA[i + 1] && currentDNA[i] == 1) {
                currentCount++;
                if (currentCount > bestCount) {
                    bestCount = currentCount;
                }
            } else {
                currentCount = 1;
            }
        }

        if (currentCount > countMax) {
            return currentDNA;
        }
        else {
            return longestSubsequencesOfOnes;
        }
    }
}
