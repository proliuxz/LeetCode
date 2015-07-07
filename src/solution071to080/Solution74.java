package solution071to080;

public class Solution74
{
	public boolean searchMatrix(int[][] matrix, int target)
	{
		if (matrix == null)
			return false;
		int height = matrix.length;
		int width = matrix[0].length;
		int left = 0;
		int right = height * width - 1;

		while (left <= right)
		{
			int mid = (left + right) / 2;
			int midX = mid / width;
			int midY = mid % width;

			if (matrix[midX][midY] == target)
				return true;

			if (matrix[midX][midY] < target)
			{
				left = mid + 1;
			} else
			{
				right = mid - 1;
			}
		}

		return false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution74 s74 = new Solution74();
		int target = 22;
		int[][] matrix = { { 1, 4, 6, 7, 9 }, { 10, 14, 16, 18, 19 },
				{ 20, 22, 24, 25, 28 }, { 31, 33, 34, 36, 39 },
				{ 40, 45, 47, 48, 49 } };
		boolean result = s74.searchMatrix(matrix, target);
		System.out.println(result);
	}

}
