import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int matrixSize = Integer.parseInt(input.split(", ")[0]);
        String patter = input.split(", ")[1];

        int[][] matrix = new int[matrixSize][matrixSize];
        int count = 1;

        if (patter.equals("A")) {
            matrix = fillPatternA(matrix, count);
        } else {
            matrix = fillPatternB(matrix, count);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [][] fillPatternA(int[][] matrix, int count) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = count;
                count++;
            }
        }
        return matrix;
    }

    public static int [][] fillPatternB(int[][] matrix, int count) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = count;
                    count++;
                }
            } else {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = count;
                    count++;
                }
            }
        }
        return matrix;
    }
}
