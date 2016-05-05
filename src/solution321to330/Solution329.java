package solution321to330;

/**
 * Created by Liu Xinzhuo on 2016/4/26 0026.
 */
public class Solution329 {
    public int longestIncreasingPath(int[][] matrix) {

        int maxVal = 0;

        for (int i = 0; i <matrix.length ; i++)
        {
            for (int j = 0; j <matrix[0].length ; j++)
            {
                boolean[][] visited = new boolean[matrix.length][matrix[0].length];
                int temp = longestIncreasingPathHelper(matrix, visited, i, j, matrix[i][j] - 1);
                if (temp > maxVal)
                {
                    maxVal = temp;
                }
            }    
        }
        return maxVal;
    }
    public static int longestIncreasingPathHelper(int[][] matrix, boolean[][] visited, int i, int j, int prev)
    {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length)
            return 0;

        if (visited[i][j] == true|| matrix[i][j] <= prev)
            visited[i][j] = true;
        int max1=0;
        int max2=0;
        int max3=0;
        int max4=0;

        if (visited[i+1][j]==false)
        max1 = longestIncreasingPathHelper(matrix, visited, i + 1, j, matrix[i][j]);
        if (visited[i-1][j]==false)
        max2 = longestIncreasingPathHelper(matrix, visited, i - 1, j, matrix[i][j]);
        if (visited[i][j+1]==false)
        max3 = longestIncreasingPathHelper(matrix, visited, i, j + 1, matrix[i][j]);
        if (visited[i][j-1]==false)
        max4 = longestIncreasingPathHelper(matrix, visited, i, j - 1, matrix[i][j]);

        visited[i][j] = false;

        return Math.max(Math.max(max1,max2),Math.max(max3,max4)) + 1;
    }

    public static void main(String[] args)
    {
        Solution329 solution329 = new Solution329();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(solution329.longestIncreasingPath(matrix));
    }
}
