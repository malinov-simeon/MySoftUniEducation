import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> racers = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        String regexName = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexName);
        String regexDistance = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexDistance);
        Map<String, Integer> racersDistance = new LinkedHashMap<>();
        for (String racer : racers) {
            racersDistance.put(racer, 0);
        }

        while (!input.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();
            int distance = 0;
            Matcher matcherName = patternName.matcher(input);
            Matcher matcherDistance = patternDistance.matcher(input);

            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }
            String name = nameBuilder.toString();
            if (racers.contains(name)) {
                int currentDistance = racersDistance.get(name);
                racersDistance.put(name, currentDistance + distance);
            }

            input = scanner.nextLine();
        }
        Map<String, Integer> sortedMap = racersDistance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) //sorted map by value
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));
        List<String> top3Racers = new ArrayList<>(sortedMap.keySet());
        System.out.println("1st place: " + top3Racers.get(0));
        System.out.println("2nd place: " + top3Racers.get(1));
        System.out.println("3rd place: " + top3Racers.get(2));
    }
}
