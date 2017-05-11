package solution051to100;

public class Solution62
{
	public int uniquePaths(int m, int n)
	{
		if(m==0||n==0)
			return 0;
		if(m==1||n==1)
			return 1;
		int[][] result = new int[m][n];
		for (int i = 1; i < m; i++)
			result[i][0] = 1;
		for (int j = 1; j < n; j++)
			result[0][j] = 1;
		for (int i = 1; i < m; i++)
			for (int j = 1; j < n; j++)
			{
				result[i][j] = result[i - 1][j] + result[i][j - 1];
			}
		return result[m - 1][n - 1];
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int m = 1;
		int n = 2;
		Solution62 s62 = new Solution62();
		System.out.println(s62.uniquePaths(m, n));
	}

}
