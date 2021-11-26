package StudentsLab_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String firstName = input.split("\\s+")[0];
            String lastName = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);
            String hometown = input.split("\\s+")[3];
            Student student = new Student(firstName, lastName, age, hometown);
            boolean replace = false;
            for (int i = 0, studentsSize = students.size(); i < studentsSize; i++) {
                if (students.get(i).getFirstName().equals(student.getFirstName())
                        && students.get(i).getLastName().equals(student.getLastName())) {
                    students.get(i).setAge(student.getAge());
                    students.get(i).setHometown(student.getHometown());
                    replace = true;
                    break;
                }
            }

            if (!replace) {
                students.add(student);
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        students.removeIf(student -> !student.getHometown().equals(city));

        for (Student student : students) {
            System.out.printf("%s %s is %d years old%n", student.getFirstName()
                    , student.getLastName(), student.getAge());
        }
    }
}
