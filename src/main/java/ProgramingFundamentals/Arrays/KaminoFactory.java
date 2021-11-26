package ProgramingFundamentals.Arrays;

import java.util.Scanner;

public class KaminoFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int DNALength = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split("!");

        int longestSubsequenceOfOnes = Integer.MIN_VALUE;
        String longestSequence = "";
        int maxSum = Integer.MIN_VALUE;
        int bestStartIndex = 0;

        while (!input[0].equals("Clone them")) {
            int currentSum = 0;

            for (int i = 0; i < input.length; i++) {

                if (input[i].equals("1")) {
                    currentSum += 1;
//                    if (currentSum > maxSum) {
//                        longestSequence = currentSequence;
//                    }
                }

                for (int j = i + 1; j < input.length; j++) {

                    if (!input[i].equals("1")) {
                        break;
                    }

                    String currentSequence = input[i] + " ";
                    int subsequenceOfOnes = 1;

                    if (input[i].equals(input[j])) {
                        subsequenceOfOnes += 1;
                        currentSequence = input[j] + " ";
                        if (subsequenceOfOnes > longestSubsequenceOfOnes) {
                            longestSequence = currentSequence;
                        } else if (subsequenceOfOnes == longestSubsequenceOfOnes) {
                            if (currentSum > maxSum) {

                            }
                        }
                    }

//                    if (subsequenceOfOnes > longestSubsequenceOfOnes) {
//                        longestSequence = currentSequence;
//                    } else if (subsequenceOfOnes == longestSubsequenceOfOnes) {
//                        if (currentSum > maxSum) {
//                            longestSequence = currentSequence;
//                        }
//                    }
//
//                    if (input[j].equals(input[i])) {
//                        subsequenceOfOnes += 1;
//                        currentSequence += input[j] + " ";
//                    } else {
//                        if (subsequenceOfOnes > longestSubsequenceOfOnes) {
//                            longestSequence = currentSequence;
//                            break;
//                        } else if (subsequenceOfOnes == longestSubsequenceOfOnes) {
//                            if (currentSum > maxSum) {
//                                maxSum = currentSum;
//                            }
//                        }
//                        break;
//                    }
//                }

                }
                input = scanner.nextLine().split("!");
            }
        }
    }
}

