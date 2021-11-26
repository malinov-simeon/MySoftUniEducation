import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employee1Efficiency = Integer.parseInt(scanner.nextLine());
        int employee2Efficiency = Integer.parseInt(scanner.nextLine());
        int employee3Efficiency = Integer.parseInt(scanner.nextLine());
        int totalPeople = Integer.parseInt(scanner.nextLine());

        int totalEfficiency = employee1Efficiency + employee2Efficiency + employee3Efficiency;
        int time = 0;

        while (totalPeople > 0) {
            time++;

            if (time % 4 == 0) {
                continue;
            }

            totalPeople -= totalEfficiency;
        }

        System.out.printf("Time needed: %dh.", time);
    }
}
