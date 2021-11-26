package Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student newStudent = new Student(firstName, lastName, grade);
            students.add(newStudent);
        }

        students.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(students);

        students.forEach(System.out::println);
    }
}
