import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());

        List<Integer> initialQuality = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int [] initialQualityCopy = new int[initialQuality.size()];
        for (int i = 0; i < initialQualityCopy.length; i++) {
            initialQualityCopy[i] = initialQuality.get(i);
        }

        String input = scanner.nextLine();

        while (!input.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(input);
            for (int i = 0; i < initialQuality.size(); i++) {
                initialQuality.set(i, initialQuality.get(i) - power);
                if (initialQuality.get(i) <= 0) {
                    double reset = initialQualityCopy[i] * 3;
                    if (reset <= savings) {
                        initialQuality.set(i, initialQualityCopy[i]);
                        savings -= reset;
                    }
                }
            }
            input = scanner.nextLine();
        }
        initialQuality.removeIf(integer -> integer <= 0);
        System.out.println(initialQuality
                .toString()
                .replaceAll("[\\[\\],]"
                        , ""));

        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
