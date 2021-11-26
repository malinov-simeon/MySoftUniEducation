import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());

        int targets = 0;
        int originalN = N;

        while (N >= M) {
            N -= M;
            targets++;

            if (N == 0.5 * originalN && Y != 0) {
                N /= Y;
            }
        }

        System.out.printf("%d%n%d", N, targets);
    }
}