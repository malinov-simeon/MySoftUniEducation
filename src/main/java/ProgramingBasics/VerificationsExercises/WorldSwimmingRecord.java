import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вход

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeSecondsFor1M = Double.parseDouble(scanner.nextLine());

        //Изчисляваме времето, добавяме забавяне
        double goal = distance * timeSecondsFor1M;

        double slow = Math.floor(distance / 15) * 12.5; // Закръгляме забавянията надолу

        double result = goal + slow;


        if (recordSeconds <= result) {
            double difference = Math.abs(recordSeconds - result);
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        }

    }
}
