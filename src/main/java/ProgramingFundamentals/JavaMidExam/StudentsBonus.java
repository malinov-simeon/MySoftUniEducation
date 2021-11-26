import java.util.Scanner;

public class StudentsBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsNumber = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int lectureBonus = Integer.parseInt(scanner.nextLine());

        String [] students = new String[studentsNumber];

        double maxBonus = 0;
        int maxAttendance = 0;

        for (int i = 0; i < students.length; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());
            //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
            if (studentAttendance > maxAttendance) {
                maxAttendance = studentAttendance;
                maxBonus = 1.0 * studentAttendance / lecturesCount * (5 + lectureBonus);
            }
        }
        //"Max Bonus: {maxBonusPoints}."
        //"The student has attended {studentAttendances} lectures."
        System.out.printf("Max Bonus: %.0f.%nThe student has attended %d lectures.", Math.ceil(maxBonus), maxAttendance);
    }
}
