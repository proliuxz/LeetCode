package solution151to200;

/**
 * Created by Liu Xinzhuo on 2016/5/22 0022.
 */
public class Solution200 {
    int[][] numsChanges = {{0,1},{1,0},{0,-1},{-1,0}};
    int m,n;
    public int numIslands(char[][] grid) {
        int result = 0;
        if (grid==null)
            return 0;
        m = grid.length;
        if (m==0)
            return 0;
        n = grid[0].length;
        if(n==0)
            return 0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    result++;
                }
            }
        }
        return result;
    }

    public void dfs(char[][] grid,int x, int y)
    {
        if (x < 0 || x >= m || y < 0 || y >= n) return;
        if (grid[x][y]=='1')
        {
            grid[x][y] = 'x';
            for (int[] change:numsChanges)
            {
                dfs(grid,x+change[0],y+change[1]);
            }
        }
    }

    public static void main(String[] args)
    {
        Solution200 solution200 = new Solution200();
        char[][] A = {{'1','1'}};
        System.out.println(solution200.numIslands(A));
    }
}
