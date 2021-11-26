package p01_WorkingWithAbstraction.jediGalaxy;

public class Galaxy {
    private int[][] matrix;

    public Galaxy(int rows, int cols) {
        readMatrix(rows, cols);
    }

    private void readMatrix(int rows, int cols) {
        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.matrix[i][j] = value++;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
