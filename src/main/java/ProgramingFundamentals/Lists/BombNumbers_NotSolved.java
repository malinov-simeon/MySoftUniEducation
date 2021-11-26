import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_NotSolved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>numbers= Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String[]specialBombNumber = scanner.nextLine().split(" ");

        List<String>numbersOriginal = numbers;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(specialBombNumber[0])) {
                for (int j = 0; j <= Integer.parseInt(specialBombNumber[1]); j++) {
                    numbers.add(i - 1, null);
                }
                for (int j = 0; j < Integer.parseInt(specialBombNumber[1]); j++) {
                    numbersOriginal.remove(i + 1);
                }
            }
        }
    }
}
