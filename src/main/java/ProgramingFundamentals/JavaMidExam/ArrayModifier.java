import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];
            switch (command) {
                case "swap":

                    int firstIndex = Integer.parseInt(input.split("\\s+")[1]);
                    int secondIndex = Integer.parseInt(input.split("\\s+")[2]);
                    int firstNumber = integers.get(firstIndex);
                    int secondNumber = integers.get(secondIndex);
                    integers.set(firstIndex,secondNumber);
                    integers.set(secondIndex,firstNumber);
                    break;
                case "multiply":
                    int firstIndex2 = Integer.parseInt(input.split("\\s+")[1]);
                    int secondIndex2 = Integer.parseInt(input.split("\\s+")[2]);
                    integers.set(firstIndex2
                            ,integers.get(firstIndex2) * integers.get(secondIndex2));
                    break;
                case "decrease":
                    for (int i = 0; i < integers.size(); i++) {
                        integers.set(i, integers.get(i) - 1);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
//        for (int i = 0; i < integers.size(); i++) {
//            if (i == integers.size() - 1) {
//                System.out.print(integers.get(i));
//                break;
//            }
//            System.out.print(integers.get(i) + ", ");
//        }
        System.out.println(integers.toString().replaceAll("[\\[\\]]", ""));
    }
}
