import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> mixedList = new ArrayList<>();


        for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
            mixedList.add(firstList.get(i));
            mixedList.add(secondList.get(secondList.size() -1 - i));
        }
        int startRange = 0;
        int endRange = 0;
        if (firstList.size() < secondList.size()) {
            startRange = secondList.get(0);
            endRange = secondList.get(1);
        } else {
            startRange = firstList.get(firstList.size() - 1);
            endRange = firstList.get(firstList.size() - 2);
        }
        if (startRange > endRange) {
            startRange += endRange;
            endRange = startRange - endRange;
            startRange -= endRange;
        }
        List<Integer> removeList = new ArrayList<>();
        for (Integer integer : mixedList) {
            if (integer >= endRange
            || integer <= startRange) {
                removeList.add(integer);
            }
        }
        mixedList.removeAll(removeList);
        Collections.sort(mixedList);
        System.out.println(mixedList.toString().replaceAll("[\\[\\],]", ""));
    }
}
