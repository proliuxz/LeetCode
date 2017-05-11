package solution301to350;

/**
 * Created by Liu Xinzhuo on 2016/4/26 0026.
 */
public class Solution329 {

    public static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int max = 0;

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] cache = new int[m][n]; // cache
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dfs(matrix, m, n, i, j, cache));
            }
        }

        return max;
    }

    private int dfs(int[][] matrix, int m, int n, int i, int j, int[][] cache) {
        if (cache[i][j] != 0) return cache[i][j]; // cache

        int max = 1;

        for (int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];

            if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] < matrix[i][j]) {
                max = Math.max(max, 1 + dfs(matrix, m, n, x, y, cache));
            }
        }

        cache[i][j] = max;
        return max;
    }

    public static void main(String[] args)
    {
        Solution329 solution329 = new Solution329();
        int[][] matrix = null;
        System.out.println(solution329.longestIncreasingPath(matrix));
    }
}
