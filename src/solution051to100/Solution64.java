package solution051to100;

public class Solution64
{
	public int minPathSum(int[][] grid)
	{
		int height = grid.length;
		int width = grid[0].length;
		for (int i = 0; i< height; i++)
			for (int j = 0; j<width ; j ++)
			{
				if (i==0&&j==0)
				{
					
				}
				else if(i==0)
				{
					grid[i][j]=(grid[i][j]+grid[i][j-1]);
				}
				else if(j==0)
				{
					grid[i][j]=(grid[i][j]+grid[i-1][j]);
				}
				else
				{
				grid[i][j]=(grid[i][j]+Math.min(grid[i-1][j],grid[i][j-1]));
				}
			}
		return grid[height-1][width-1];
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution64 s64 = new Solution64();
		int[][] grid = {{1,2},{1,1}};
		System.out.println(s64.minPathSum(grid));
	}

}
