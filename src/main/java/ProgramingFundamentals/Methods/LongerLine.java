import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());
        int line1 = longestLine(x1, x2, y1, y2);
        int line2 = longestLine(x3, x4, y3, y4);
        int sum1 = 0;
        int sum2 = 0;
        if (line1 >= line2) {
            sum1 = Math.abs(x1) + Math.abs(y1);
            sum2 = Math.abs(x2) + Math.abs(y2);
            if (sum1 < sum2) {
                System.out.printf("(%d, %d) (%d, %d)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%d, %d) (%d, %d)", x2, y2, x1, y1);
            }
        } else {
            sum1 = Math.abs(x3) + Math.abs(y3);
            sum2 = Math.abs(x4) + Math.abs(y4);
            if (sum1 < sum2) {
                System.out.printf("(%d, %d) (%d, %d)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%d, %d) (%d, %d)", x4, y4, x3, y3);
            }
        }
    }

    private static int longestLine(int x1, int x2, int y1, int y2) {
        int firstParameter = 0;
        int secondParameter = 0;
        if (x1 < x2) {
            firstParameter = x2 - x1;
        } else if (x1 > x2) {
            firstParameter = x1 - x2;
        }
        if (y1 < y2) {
            firstParameter = y2 - y1;
        } else if (x1 > x2) {
            firstParameter = y1 - y2;
        }
        return firstParameter + secondParameter;
    }
}
