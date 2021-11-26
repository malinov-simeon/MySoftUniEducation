package RandomizeWords;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Random random = new Random();

        for (int i = 0; i < input.size(); i++) {
            String firstElement = input.get(random.nextInt(input.size()));
            String secondElement = input.get(random.nextInt(input.size()));
            int firstIndex = input.indexOf(firstElement);
            int secondIndex = input.indexOf(secondElement);
            input.set(firstIndex, secondElement);
            input.set(secondIndex, firstElement);
        }
        for (String s : input) {
            System.out.println(s);
        }
    }
}
