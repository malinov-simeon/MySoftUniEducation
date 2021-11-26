import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialSchedule = Arrays
                .stream(scanner.nextLine().split(",\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String[] commandArray = command.split(":");
            String title = commandArray[1];
            String ex = title + "-Exercise";

            switch (commandArray[0]) {
                case "Add":
                    if (!initialSchedule.contains(title)) {
                        initialSchedule.add(title);
                    }
                    break;
                case "Insert":
                    if (!initialSchedule.contains(title)) {
                        initialSchedule.add(Integer.parseInt(commandArray[2]), title);
                    }
                    break;
                case "Remove":
                    initialSchedule.remove(title);
                    initialSchedule.remove(title + "-Exercise");
                    break;
                case "Swap":
                    String title2 = commandArray[2];
                    String ex2 = title2 + "-Exercise";
                    if (initialSchedule.contains(title)
                            && initialSchedule.contains(title2)) {
                        int index1 = initialSchedule.indexOf(title);
                        int index2 = initialSchedule.indexOf(title2);
                        initialSchedule.set(index1, title2);
                        initialSchedule.set(index2, title);

                        if (initialSchedule.contains(ex)) {
                            initialSchedule.remove(ex);
                            initialSchedule.add(index2 + 1, ex);
                        }
                        if (initialSchedule.contains(ex2)) {
                            initialSchedule.remove(ex2);
                            initialSchedule.add(index1 + 1, ex2);
                        }
                    }
                    break;
                case "Exercise":
                    int indexLessonTitle = initialSchedule.indexOf(title);
                    if (initialSchedule.contains(title)) {
                        if(indexLessonTitle == initialSchedule.size() - 1) {
                            initialSchedule.add(indexLessonTitle + 1, ex);
                        } else  if(!initialSchedule.get(indexLessonTitle + 1).equals(ex)) {
                            initialSchedule.add(indexLessonTitle + 1, ex);
                        }
                    } else {
                        initialSchedule.add(title);
                        initialSchedule.add(ex);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        int count = 1;
        for (String s : initialSchedule) {
            System.out.println(count + "." + s);
            count++;
        }
    }
}
