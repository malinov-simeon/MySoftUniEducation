import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        closestToTheCenter(x1,y1,x2,y2);
    }

    private static void closestToTheCenter(int x1, int y1, int x2, int y2) {
        int distance1 = Math.abs(x1) + Math.abs(y1);
        int distance2 = Math.abs(x2) + Math.abs(y2);
        if (distance2 < distance1){
            System.out.printf("(%d, %d)", x2,y2);
        } else if (distance2 >= distance1) {
            System.out.printf("(%d, %d)", x1,y1);
        }
    }
}
