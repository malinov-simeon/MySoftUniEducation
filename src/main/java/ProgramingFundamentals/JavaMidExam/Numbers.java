import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        // намираме средната стоност
        int sum = 0;
        for (Integer integer : sequence) {
            sum += integer;
        }
        double averageValue = 1.0 * sum / (sequence.size());

        //намираме всички числа в листа, които са по-малки от средната стойност
        // добавяме  ги в нов лист
        List<Integer> lessThanAverage = new ArrayList<>();
        for (Integer integer : sequence) {
            if (integer <= averageValue) {
                lessThanAverage.add(integer);
            }
        }
        // премахваме лист с ненужните числа от основния лист
        sequence.removeAll(lessThanAverage);

        // проверяваме дали основният лист е празен
        boolean valid = !sequence.isEmpty();

        if (valid) {
            // листа е валиден
            // подреждаме го и го принтираме
            Collections.sort(sequence);
            Collections.reverse(sequence);

            print(sequence);
        } else {
            // листа е невалиден притираме "No"
            System.out.println("No");
        }
        //край
    }

    private static void print(List<Integer> sequence) {
        for (int i = 0; i < 5; i++) {
            if (i >= sequence.size()) {
                break;
            }
            System.out.print(sequence.get(i) + " ");
        }
    }
}
