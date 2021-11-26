package ProgramingFundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoSolved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int masterCounter = 0;
        int bestCounter = 0;
        int bestSequence = 0;
        int bestIndex = 0;
        int bestSum = 0;
        int[] bestDNA = new int[n];

        while (!"Clone them!".equals(command)) {
            int currentSum = 0, currentIndex = Integer.MAX_VALUE, currentSequence = 1; int currentBestSequence = 1;
            int[] currentDNA = Arrays
                    .stream(command.split("!+"))
                    .limit(n)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            masterCounter++;

            for (int j : currentDNA) {
                if (j == 1) {
                    currentSum++;
                }
            }
            for (int i = 0; i < currentDNA.length - 1; i++) {
                if (currentDNA[i] == currentDNA[i + 1] && currentDNA[i] == 1) {
                    currentSequence++;
                    if (i < currentIndex) {
                        currentIndex = i;
                    }
                } else {
                    if (currentSequence > currentBestSequence) {
                        currentBestSequence = currentSequence;
                        currentSequence = 1;
                    }
                }
            }

            if ((currentBestSequence > bestSequence)
                    || ((currentBestSequence == bestSequence) && (currentIndex < bestIndex))
                    || ((currentBestSequence == bestSequence) && (currentIndex == bestIndex) && (currentSum > bestSum))) {
                bestCounter = masterCounter;
                bestSequence = currentBestSequence;
                bestIndex = currentIndex;
                bestSum = currentSum;
                bestDNA = currentDNA;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCounter, bestSum);
        for (int i : bestDNA) {
            System.out.print(i + " ");
        }

    }
}