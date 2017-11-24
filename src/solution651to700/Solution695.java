package solution651to700;

public class Solution695 {
    int result = 0;
    int[][] grid;
    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        if (grid==null || grid.length==0 || grid[0].length==0)
            return 0;
        this.grid = grid;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if (grid[i][j]==1)
                    result = Math.max(result, helper(i,j));
            }
        }
        return result;
    }

    private int helper(int x, int y) {
        int result = 0;
        if (grid[x][y]==0)
            return result;
        else
        {
            result+=1;
            grid[x][y] = 0;
        }
        for (int[] dir: dirs
             ) {
            int xi = x + dir[0];
            int yi = y + dir[1];
            if (xi >= 0 && xi < grid.length && yi >= 0 && yi < grid[0].length)
                result+=helper(xi,yi);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        Solution695 s695 = new Solution695();
        int result = s695.maxAreaOfIsland(grid);
        System.out.println(result);
    }
}
