package solution001to050;

public class Solution48
{

	public void rotate(int[][] matrix)
	{
		if (matrix == null)
			return;
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++)
		{
			for (int j = 0; j < (n + 1) / 2; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 - j][i];
				matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
				matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
				matrix[j][n - 1 - i] = temp;
			}
		}
	}

	public static void swap(int a, int b)
	{
		int c = a;
		a = b;
		b = c;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution48 s48 = new Solution48();
		s48.rotate(new int[5][5]);
	}

}
