import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sum += people;
            System.out.print(people + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}
