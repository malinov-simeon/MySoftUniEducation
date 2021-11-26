import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        printPyramid(input);
    }

    private static void printPyramid(int input) {
        printUpperHalf(input);
        printBottomHalf(input);
    }

    private static void printBottomHalf(int input) {
        for (int i = input; i >= 1; i--) {
            printLine(i);
        }
    }

    private static void printUpperHalf(int input) {
        for (int i = 1; i < input; i++) {
            printLine(i);
        }
    }

    private static void printLine(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
