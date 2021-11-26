import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        List<Character> digits = new ArrayList<>();
        List<Character> nonDigits = new ArrayList<>();

        for (int i = 0; i < message.length(); i++) {
            if (Character.isDigit(message.charAt(i))) {
                digits.add(message.charAt(i));
            } else {
                nonDigits.add(message.charAt(i));
            }
        }
        List<Character> takeList = new ArrayList<>();
        List<Character> skipList = new ArrayList<>();
        for (int i = 0; i < digits.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(digits.get(i));
            } else {
                skipList.add(digits.get(i));
            }
        }

        StringBuilder result = new StringBuilder();
        int moves = 0;
        int skipIndex = 0;
        for (char number : takeList) {
            int takeNumber = Integer.parseInt(String.valueOf(number));
            for (int i = 0; i < takeNumber; i++) {
                if (moves >= nonDigits.size()) {
                    break;
                }
                result.append(nonDigits.get(moves));
                moves++;
            }
            int skipNumber = Integer.parseInt(String.valueOf(skipList.get(skipIndex)));
            skipIndex++;
            moves += skipNumber;
        }
        System.out.println(result);
    }
}

