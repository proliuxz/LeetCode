package solution301to350;

public class Solution304 {
    int[][] sumMatrix;
    public Solution304(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        sumMatrix = new int[matrix.length + 1][matrix[0].length + 1];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                sumMatrix[r + 1][c + 1] = sumMatrix[r + 1][c] + sumMatrix[r][c + 1] + matrix[r][c] - sumMatrix[r][c];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumMatrix[row2 + 1][col2 + 1] - sumMatrix[row1][col2 + 1] - sumMatrix[row2 + 1][col1] + sumMatrix[row1][col1];
    }
}
