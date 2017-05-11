package solution051to100;

/**
 * Created by Liu Xinzhuo on 2016/5/18 0018.
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
        if (obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0)
            return 0;
        if (obstacleGrid.length==1||obstacleGrid[0].length==1)
        {
            for (int[] temp : obstacleGrid)
            {
                for(int x: temp)
                    if (x==1)
                        return 0;
            }
            return 1;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        obstacleGrid[0][0] = obstacleGrid[0][0]==1?0:1;
        for (int i = 1; i <m ; i++) {
            if (obstacleGrid[i][0]!=1)
                obstacleGrid[i][0] = obstacleGrid[i-1][0];
            else
                obstacleGrid[i][0] = 0;
        }
        for (int i = 1; i <n ; i++) {
            if (obstacleGrid[0][i]!=1)
                obstacleGrid[0][i] = obstacleGrid[0][i-1];
            else
                obstacleGrid[0][i] = 0;
        }
        for (int i = 1; i < m ; i++)
            for (int j = 1; j < n ; j++)
            {
                if (obstacleGrid[i][j]==1)
                    obstacleGrid[i][j] = 0;
                else
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
            }
        return obstacleGrid[m-1][n-1];
    }

    public static void main(String[] args)
    {
        Solution63 solution63 = new Solution63();
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(solution63.uniquePathsWithObstacles(obstacleGrid));
    }
}
