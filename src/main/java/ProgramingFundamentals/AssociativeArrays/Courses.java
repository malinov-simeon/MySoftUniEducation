import java.util.*;
import java.util.stream.Collectors;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> courses = new TreeMap<>();

        while (!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (courses.containsKey(courseName)) {
                courses.get(courseName).add(studentName);
            } else {
                courses.put(courseName, new ArrayList<>(){{
                    add(studentName);
                }});
            }
            input = scanner.nextLine();
        }

        courses.entrySet().stream()
                .sorted(Collections.reverseOrder(Comparator.comparingInt(c -> c.getValue().size())))
                .forEach(pair -> {
                    int size = pair.getValue().size();
                    System.out.println(pair.getKey() + ": " + size);
                    pair.getValue().stream()
                            .sorted()
                            .forEach(student -> System.out.println("-- " + student));
                });
    }
}
