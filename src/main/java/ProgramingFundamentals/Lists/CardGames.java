import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> handOne = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> handTwo = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (handOne.size() > 0 && handTwo.size() > 0) {

            int cardOne = handOne.get(0);
            int cardTwo = handTwo.get(0);

            if (cardOne > cardTwo) {
                handOne.add(cardOne);

                handOne.add(cardTwo);

                handOne.remove(0);

                handTwo.remove(0);

            } else if (cardOne < cardTwo) {
                handTwo.add(cardTwo);

                handTwo.add(cardOne);

                handOne.remove(0);

                handTwo.remove(0);

            } else if (cardOne == cardTwo) {
                handOne.remove(0);

                handTwo.remove(0);
            }

        }

        if (!handOne.isEmpty()) {
            int sum = 0;
            for (Integer number : handOne) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (!handTwo.isEmpty()) {
            int sum = 0;
            for (Integer number : handTwo) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
