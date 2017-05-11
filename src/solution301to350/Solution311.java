package solution301to350;

import static Util.Show.showArrays;

/**
 * Created by Xinzhuo Liu on 12/1/2016.
 */
public class Solution311 {
    public int[][] multiply(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int nB = B[0].length;
        int[][] result = new int[m][nB];

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                if (A[i][k] != 0) {
                    for (int j = 0; j < nB; j++) {
                        if (B[k][j] != 0)
                            result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution311 s311 = new Solution311();
        int[][] A = {{1, 0, 0}, {-1, 0, 3}};
        int[][] B = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        int result[][] = s311.multiply(A, B);
        showArrays(result);
    }
}
