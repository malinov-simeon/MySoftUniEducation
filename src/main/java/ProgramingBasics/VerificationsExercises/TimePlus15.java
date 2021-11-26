import java.util.Scanner;

public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вход
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        // Добавят се 15 минути
        minutes += 15;

        // Изписва часовете и минутите
        if (minutes >= 60) {
            hours += 1;
            minutes-=60;
        }
        if (hours >= 24) {
            hours -= 24;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
