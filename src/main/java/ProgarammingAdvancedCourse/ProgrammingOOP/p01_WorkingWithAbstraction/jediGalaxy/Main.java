package p01_WorkingWithAbstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays
                .stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];
        Galaxy galaxy = new Galaxy(rows, cols);

        readMatrix(rows, cols, matrix);

        String command = scanner.nextLine();
        int sum = 0;

        while (!command.equals("Let the Force be with you")) {
            int[] ivoCoordinatesArray = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilCoordinatesArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int evilRow = evilCoordinatesArray[0];
            int evilCol = evilCoordinatesArray[1];
            while (evilRow >= 0 && evilCol >= 0) {
                if (evilRow < galaxy.getMatrix().length && evilCol < galaxy.getMatrix().length) {
                    matrix[evilRow][evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }

            int ivoRow = ivoCoordinatesArray[0];
            int ivoCol = ivoCoordinatesArray[1];
            while (ivoRow >= 0 && ivoCol < galaxy.getMatrix()[1].length) {
                if (ivoRow < matrix.length && ivoCol >= 0 && ivoCol < matrix[0].length) {
                    sum += matrix[ivoRow][ivoCol];
                }

                ivoCol++;
                ivoRow--;
            }
            command = scanner.nextLine();
        }
        System.out.println(sum);
    }

    private static void readMatrix(int rows, int cols, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
    }
}
