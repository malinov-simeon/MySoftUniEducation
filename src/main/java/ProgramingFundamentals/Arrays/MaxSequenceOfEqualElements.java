import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String longestSequence = "";
        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            String currentSequence = input[i] + " ";
            int count = 1;

            for (int j = i + 1; j < input.length; j++) {
                if (input[i].equals(input[j])) {
                    currentSequence += input[j] + " ";
                    count++;
                } else {
                    if (count > maxCount) {
                        maxCount = count;
                        longestSequence = currentSequence;
                    }
                    break;
                }
                if (count > maxCount) {
                    maxCount = count;
                    longestSequence = currentSequence;
                }
            }
        }
        System.out.println(longestSequence);
    }
}
